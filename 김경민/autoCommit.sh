git pull &&
git add . &&
gitStatus=`git status` &&
fileName=`java commitMessage $gitStatus` &&
git commit -m "$fileName" &&
git push
