import sys
input = sys.stdin.readline

n = int(input())

towers = []

for _ in range(n):
    towers.append(int(input()))

sumTowers = []

sumTower = 0

for i in range(n):
    sumTower += towers[i]
    sumTowers.append(sumTower)

distance = sum(towers)
halfDistance = distance / 2

answer = 0

for i in range(0, n):
    now = 0
    for j in range(i + 1, n):
        now = sumTowers[j] - sumTowers[i]
        if now >= halfDistance:
            if distance - now > answer:
                answer = distance - now
            if sumTowers[j - 1] - sumTowers[i] > answer:
                answer = sumTowers[j - 1] - sumTowers[i]
            break
    if now <= halfDistance:
        if now > answer:
            answer = now

print(answer)