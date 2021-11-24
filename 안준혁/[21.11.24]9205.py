import sys
input = sys.stdin.readline
from queue import Queue
t = int(input())

answers = []
for _ in range(t):
    n = int(input())
    answer = "sad"
    startX, startY = map(int, input().split())
    convenientStore = []
    notVisit = {}
    for _ in range(n):
        x, y = map(int, input().split())
        convenientStore.append([x, y])
        notVisit[x, y] = 1
    endX, endY = map(int, input().split())
    q = Queue()
    q.put([startX, startY])
    notVisit[startX, startY] = 0
    while not q.empty():
        nowX, nowY = q.get()
        if (abs(nowX - endX) + abs(nowY - endY)) <= 1000:
            answer = "happy"
            break
        for c in convenientStore:
            distance = abs(nowX - c[0]) + abs(nowY - c[1])
            if distance <= 1000:
                if notVisit[c[0], c[1]]:
                    notVisit[c[0], c[1]] = 0
                    q.put([c[0], c[1]])
    answers.append(answer)

for answer in answers:
    print(answer)