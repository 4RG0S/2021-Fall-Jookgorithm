import moment from 'moment';
import gitlog, {
  GitlogOptions,
  CommitField,
} from 'gitlog';

import { members } from './constant';

interface CommitObject {
  date: string
  [index: number]: boolean
}

const currentMoment = moment().utcOffset(540);
// To filter only java & python files.
const fileRegex = /.java|.py|.c/;
const options: GitlogOptions<CommitField> = {
  repo: __dirname,
  number: 1000,
  fields: ['authorEmail', 'authorDate'],
  since: currentMoment.clone().startOf('week').add(1, 'day').format('YYYY-MM-DD'),
};
const commitLogs = gitlog(options);

// Create commitArray
const commitArray: CommitObject[] = [];
for (let weekday = 1; weekday <= 5; weekday += 1) {
  commitArray.push({
    date: currentMoment.clone().startOf('week').add(weekday, 'day').format('YYYY-MM-DD'),
  });
}

// Fill commitArray
commitLogs.forEach((commitLog) => {
  if (commitLog.files.find((file) => file.match(fileRegex)) != null) {
    const { authorEmail, authorDate } = commitLog;
    const commitDate = moment(new Date(authorDate)).format('YYYY-MM-DD');
    const dateIndex = commitArray.findIndex((object) => object.date === commitDate);
    const matchedMember = members.find((member) => member.authorEmail.includes(authorEmail));

    if (matchedMember != null && dateIndex !== -1) {
      commitArray[dateIndex][matchedMember.id] = true;
    }
  }
});

// Get result
const result = members.map((member) => {
  const { id, name } = member;
  let count = 0;
  commitArray.forEach((object) => {
    if (object[id] === true) {
      count += 1;
    }
  });
  return {
    name,
    missedCount: 5 - count,
  };
});

// Apply Exception
const resultWithException = result.map((iter) => {
  // 커밋이 정상적으로 되지 않았던 이슈 (죽고리즘 첫째 주) + 월요일 공휴일 때문에 -2 추가
  if (iter.name === '정민경') {
    return {
      name: iter.name,
      missedCount: iter.missedCount - 2,
    };
  }
  // 그 외에는 월요일이 공휴일이기 때문에 -1 추가
  return {
    name: iter.name,
    missedCount: Math.max(0, iter.missedCount - 1),
  };
});

// eslint-disable-next-line no-console
console.log(`${currentMoment.clone().startOf('week').add(1, 'day').format('YYYY-MM-DD')} ~ ${currentMoment.clone().endOf('week').subtract(1, 'day').format('YYYY-MM-DD')}`);
// eslint-disable-next-line no-console
console.log(resultWithException);
