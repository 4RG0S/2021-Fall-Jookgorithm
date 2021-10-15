import sys

N, M = map(int, sys.stdin.readline().rstrip().split())

data = list(map(int, sys.stdin.readline().rstrip().split()))
dp = [0] * (N+1)

for i in range(N):
  dp[i+1] = dp[i] + data[i]

# print(dp)

for _ in range(M):
  x, y = map(int, sys.stdin.readline().rstrip().split())
  print(dp[y]-dp[x-1])