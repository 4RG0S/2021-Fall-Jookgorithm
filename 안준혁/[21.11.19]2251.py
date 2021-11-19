from queue import Queue

q = Queue()
a, b, c = map(int, input().split())

answers = []

q.put([0, 0, c])

visitAB = [[0] * 201 for _ in range(201)]

while not q.empty():
    nowA, nowB, nowC = q.get()
    if nowA == 0:
        answers.append(nowC)
    if nowA != 0:
        if nowC != c:
            temp = nowA + nowC
            if temp <= c:
                afterA = 0
                afterC = temp
            else:
                afterA = temp - c
                afterC = c
            if not visitAB[afterA][nowB]:
                visitAB[afterA][nowB] = 1
                q.put([afterA, nowB, afterC])
        if nowB != b:
            temp = nowA + nowB
            if temp <= b:
                afterA = 0
                afterB = temp
            else:
                afterA = temp - b
                afterB = b
            if not visitAB[afterA][afterB]:
                visitAB[afterA][afterB] = 1
                q.put([afterA, afterB, nowC])
    if nowB != 0:
        if nowA != a:
            temp = nowB + nowA
            if temp <= a:
                afterB = 0
                afterA = temp
            else:
                afterB = temp - a
                afterA = a
            if not visitAB[afterA][afterB]:
                visitAB[afterA][afterB] = 1
                q.put([afterA, afterB, nowC])
        if nowC != c:
            temp = nowB + nowC
            if temp <= c:
                afterB = 0
                afterC = temp
            else:
                afterB = temp - c
                afterC = c
            if not visitAB[nowA][afterB]:
                visitAB[nowA][afterB] = 1
                q.put([nowA, afterB, afterC])
    if nowC != 0:
        if nowA != a:
            temp = nowC + nowA
            if temp <= a:
                afterC = 0
                afterA = temp
            else:
                afterC = temp - a
                afterA = a
            if not visitAB[afterA][nowB]:
                visitAB[afterA][nowB] = 1
                q.put([afterA, nowB, afterC])
        if nowB != b:
            temp = nowC + nowB
            if temp <= b:
                afterC = 0
                afterB = temp
            else:
                afterC = temp - b
                afterB = b
            if not visitAB[nowA][afterB]:
                visitAB[nowA][afterB] = 1
                q.put([nowA, afterB, afterC])

answers = list(set(answers))
answers.sort()
for answer in answers:
    print(answer, end=' ')
