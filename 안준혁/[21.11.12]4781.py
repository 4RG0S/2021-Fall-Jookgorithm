n = -1
m = -1

answers = []

while n != 0:
    n, m = input().split()
    n = int(n)
    m = float(m)
    m = int(m * 100 + 0.5)
    if n == 0:
        break
    cList = [0]
    pList = [0]
    for _ in range(n):
        c, p = input().split()
        c = int(c)
        p = float(p)
        p = int(p * 100 + 0.5)
        cList.append(c)
        pList.append(p)
    dp = [[0] * (m + 1) for _ in range(2)]
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            if pList[i] > j:
                if i % 2 == 0:
                    dp[0][j] = dp[1][j]
                else:
                    dp[1][j] = dp[0][j]
            else:
                if i % 2 == 0:
                    dp[0][j] = max(dp[0][j-pList[i]]+cList[i], dp[1][j])
                else:
                    dp[1][j] = max(dp[1][j-pList[i]]+cList[i], dp[0][j])

    if n % 2 == 0:
        answers.append(dp[0][m])
    else:
        answers.append(dp[1][m])

for answer in answers:
    print(answer)