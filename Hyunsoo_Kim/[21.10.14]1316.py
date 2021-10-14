import sys

N = int(sys.stdin.readline().rstrip())
cnt = 0
for _ in range(N):
  flag = True
  tmp = list(sys.stdin.readline().rstrip())
  # print(tmp)
  prev = ''
  tmpDict = {}
  for i in range(len(tmp)):
    if i != 0:
      prev = tmp[i-1]
    if prev != tmp[i]:
        if  tmp[i] in tmpDict.keys():
          flag = False
          break
        else:
          tmpDict[tmp[i]] = 1
  if flag:
    cnt += 1

print(cnt)
