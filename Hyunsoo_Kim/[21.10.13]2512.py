import sys

N = int(sys.stdin.readline().rstrip())

data = list(map(int, sys.stdin.readline().rstrip().split()))

sum = int(sys.stdin.readline().rstrip())

left = 0
right = max(data)
while left <= right:
  mid = (left+right)//2
  total = 0
  for i in range(len(data)):
    if data[i] >= mid:
      total += mid
    else:
      total += data[i]
  if total <= sum:
    left = mid + 1
  else:
    right = mid - 1

print(right) 
