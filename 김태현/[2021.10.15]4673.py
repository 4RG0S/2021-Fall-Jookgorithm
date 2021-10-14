N = 10001
answer = [True for i in range(N)]


def d(n):
    s = n
    while True:
        s = s + (n % 10)
        n = int(n / 10)
        if n == 0:
            break
    return s


for i in range(1, N):
    n = d(i)
    if n <= N - 1:
        answer[n] = False

for i in range(1, N):
    if answer[i]:
        print(i)
