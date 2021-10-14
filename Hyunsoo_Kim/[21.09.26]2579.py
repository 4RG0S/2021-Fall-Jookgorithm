import sys
sys.setrecursionlimit(30000)

n = int(sys.stdin.readline().rstrip())
data = [0]*(30001)
dp = [0]*(30001)

for i in range(1, n+1):
    data[i] = (int(sys.stdin.readline().rstrip()))

dp[0] = 0
dp[1] = data[1]
dp[2] = data[1]+data[2]
def stair(x):
    if x > n:
        return
    dp[x] = max(data[x]+dp[x-2], data[x]+data[x-1]+dp[x-3])
    stair(x+1)

stair(3)
print(dp[n])
