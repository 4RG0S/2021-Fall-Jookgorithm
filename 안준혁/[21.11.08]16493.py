N, M = map(int, input().split())

wastes = [0]
values = [0]

dp = [[0] * (N + 1) for _ in range(M + 1)]

for _ in range(M):
    w, v = map(int, input().split())
    wastes.append(w)
    values.append(v)

for j in range(M + 1):
    nowWaste = wastes[j]
    nowValue = values[j]
    for i in range(N + 1):
        if i == 0 or j == 0:
            dp[j][i] = 0
        elif nowWaste > i:
            dp[j][i] = dp[j - 1][i]
        else:
            dp[j][i] = max(dp[j - 1][i], nowValue + dp[j - 1][i - nowWaste])

print(dp[M][N])