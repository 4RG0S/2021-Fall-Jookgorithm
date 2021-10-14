import sys

N = int(sys.stdin.readline().rstrip())
data = list(map(int, sys.stdin.readline().rstrip().split()))
dataDict = dict()
for num in data:
  dataDict[num] = True

M = int(sys.stdin.readline().rstrip())
tmp = list(map(int, sys.stdin.readline().rstrip().split()))

for num in tmp:
  if num in dataDict.keys():
    print("1")
  else:
    print("0")

