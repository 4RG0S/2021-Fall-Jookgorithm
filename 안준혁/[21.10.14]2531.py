import sys
input = sys.stdin.readline

N, d, k, c = map(int, input().split())

sushi = []

for i in range(N):
    sushi.append(int(input()))

answer = 0

for i in range(N):
    temp = []
    for j in range(k):
        if j+i < N:
            temp.append(sushi[j + i])
        else:
            temp.append(sushi[j + i - N])


    temp = set(temp)

    if len(temp) + 1 > answer:
        if c not in temp:
            if answer < len(temp) + 1:
                answer = len(temp) + 1
        else:
            if answer < len(temp):
                answer = len(temp)

print(answer)