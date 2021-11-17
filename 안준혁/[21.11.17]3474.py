import sys
t = int(sys.stdin.readline())

answers = []

for _ in range(t):
    n = int(sys.stdin.readline())
    a = 5
    cnt = 0
    temp = 1
    while temp != 0:
        temp = n // a
        cnt += temp
        a *= 5
    answers.append(cnt)

for answer in answers:
    print(answer)