import sys

n = int(sys.stdin.readline().rstrip())
cnt = 0
number = 1
while (True):
  if '666' in str(number):
    cnt += 1
  if cnt == n:
    print(number)
    break
  else:
    number += 1
  

# print(number)