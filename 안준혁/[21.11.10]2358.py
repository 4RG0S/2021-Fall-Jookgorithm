n = int(input())
answer = 0
dots = [[0] * 2 for _ in range(n)]

for i in range(n):
    x, y = map(int, input().split())
    dots[i][0] = x
    dots[i][1] = y

dots = sorted(dots)

count = []

for i in range(n):
    for j in range(i + 1, n):
        if dots[j][0] == dots[i][0]:
            if not dots[i][0] in count:
                count.append(dots[i][0])
                answer += 1
            break
        else:
            break

dots = sorted(dots, key=lambda a:a[1])

count = []

for i in range(n):
    nowY = dots[i][1]
    for j in range(i + 1, n):
        if dots[j][1] == nowY:
            if not dots[i][1] in count:
                count.append(dots[i][1])
                answer += 1
            break
        else:
            break
print(answer)
