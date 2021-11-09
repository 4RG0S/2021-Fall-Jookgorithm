M, N = map(int, input().split())

wastes = [0]
values = [0]

dp = [[0] * (N + 1) for _ in range(2)]

for _ in range(M):
    w, v = map(int, input().split())
    wastes.append(w)
    values.append(v)

for j in range(2):
    for i in range(N + 1):
        if i == 0 or j == 0:
            dp[j][i] = 0

for j in range(M + 1):
    nowWaste = wastes[j]
    nowValue = values[j]
    for i in range(N + 1):
        if i != 0 and j != 0:
            if (j % 2) == 1:
                if nowWaste > i:
                    dp[1][i] = dp[0][i]
                else:
                    dp[1][i] = max(dp[0][i], nowValue + dp[0][i - nowWaste])
            else:
                if nowWaste > i:
                    dp[0][i] = dp[1][i]
                else:
                    dp[0][i] = max(dp[1][i], nowValue + dp[1][i - nowWaste])

if (M % 2) == 0:
    print(dp[0][N])
else:
    print(dp[1][N])