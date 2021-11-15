import sys
import heapq
input = sys.stdin.readline

N, M = map(int, input().rstrip().split())
tree = list(map(int, input().rstrip().split()))

tree.sort()
sum = 0

left = 0
right = tree[-1]

while (left <= right):
  sum = 0
  mid = (left+right)//2
  for t in tree:
    if (mid > t):
      continue
    else:
      sum += (t-mid)
  
  if sum < M:
    right = mid -1
  else:
    left = mid + 1

print(right)