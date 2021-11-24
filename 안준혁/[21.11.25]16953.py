import sys
from queue import Queue
input = sys.stdin.readline

a, b = map(int, input().split())

answer = sys.maxsize
q = Queue()
q.put([a, 1])

while not q.empty():
    now, count = q.get()
    twice = 2 * now
    plusOne = now * 10 + 1
    if twice == b:
        if answer > count + 1:
            answer = count + 1
    elif twice < b:
        if answer > count + 2:
            q.put([twice, count + 1])
    if plusOne == b:
        if answer > count + 1:
            answer = count + 1
    elif plusOne < b:
        if answer > count + 2:
            q.put([plusOne, count + 1])

if answer == sys.maxsize:
    print(-1)
else:
    print(answer)