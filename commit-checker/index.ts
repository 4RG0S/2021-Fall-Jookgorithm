import moment from 'moment';
import gitlog, {
  GitlogOptions,
  CommitField,
} from 'gitlog';

import { members } from './constant';

const currentMoment = moment().utcOffset(540);
const fileRegex = /.java|.py/;
const options: GitlogOptions<CommitField> = {
  repo: __dirname,
  number: 1000,
  fields: ['authorEmail', 'authorDate'],
  since: currentMoment.startOf('week').format('YYYY-MM-DD'),
};
const commitObject: any[] = [];

for (let weekday = 1; weekday <= 5; weekday += 1) {
  commitObject.push({
    date: currentMoment.clone().add(weekday, 'day').format('YYYY-MM-DD'),
  });
}

const commitLogs = gitlog(options);
commitLogs.forEach((commitLog) => {
  if (commitLog.files.find((file) => file.match(fileRegex)) != null) {
    // eslint-disable-next-line max-len
    const matchedMember = members.find((member) => member.authorEmail.includes(commitLog.authorEmail));
    const commitDate = moment(new Date(commitLog.authorDate)).format('YYYY-MM-DD');
    const dateIndex = commitObject.findIndex((object) => object.date === commitDate);
    if (matchedMember != null) {
      commitObject[dateIndex][matchedMember.id] = 1;
    }
  }
});

const result = members.map((member) => {
  const { id, name } = member;
  let count = 0;
  commitObject.forEach((object) => {
    if (object[id] != null) {
      count += object[id];
    }
  });
  return {
    name,
    missedCount: 5 - count,
  };
});

// Exception
const resultWithException = result.map((iter) => {
  // 커밋이 정상적으로 되지 않았던 이슈 때문에 -1 추가
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
console.log(resultWithException);
