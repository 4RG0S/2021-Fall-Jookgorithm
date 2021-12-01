from collections import deque

f, s, g, u, d = map(int, input().split())

q = deque()

notVisit = [1] * (f + 1)
notVisit[s] = 0
q.append([s, 0])
stair = True
while q:
    now, click = q.popleft()
    if now == g:
        print(click)
        stair = False
        break
    up = now + u
    down = now - d
    if up == g or down == g:
        print(click + 1)
        stair = False
        break
    if 1 <= up <= f:
        if notVisit[up]:
            notVisit[up] = 0
            q.append([up, click+1])
    if 1 <= down <= f:
        if notVisit[down]:
            notVisit[down] = 0
            q.append([down, click + 1])

if stair:
    print("use the stairs")

