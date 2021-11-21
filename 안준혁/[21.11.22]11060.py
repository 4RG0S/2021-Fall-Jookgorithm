from queue import Queue
import sys
n = int(input())

jump = list(map(int, input().split()))

q = Queue()
q.put([1, 0])
answer = sys.maxsize
notVisit = [1] * n

while not q.empty():
    location, count = q.get()
    a = jump[location - 1]
    if location + a >= n:
        if answer > count + 1:
            answer = count + 1
    else:
        for i in range(1, a + 1):
            nextLocation = location + i
            if notVisit[nextLocation - 1]:
                notVisit[nextLocation - 1] = 0
                q.put([nextLocation, count + 1])

if answer == sys.maxsize:
    print(-1)
elif n == 1:
    print(0)
else:
    print(answer)
