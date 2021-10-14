import sys

n = int(sys.stdin.readline().rstrip())
data = [0]*10001

for i in range(n):
  tmp = int(sys.stdin.readline().rstrip())
  data[tmp] += 1

for i in range(len(data)):
  if data[i]!= 0:
    for j in range(data[i]):
      print(i)