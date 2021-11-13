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

const resultWithException = result;
// result.map((iter) => ({
//   name: iter.name,
//   missedCount: Math.max(0, iter.missedCount - 1),
// }));

// eslint-disable-next-line no-console
console.log(`${currentMoment.clone().startOf('week').add(1, 'day').format('YYYY-MM-DD')} ~ ${currentMoment.clone().endOf('week').subtract(1, 'day').format('YYYY-MM-DD')}`);
// eslint-disable-next-line no-console
console.log(resultWithException);
