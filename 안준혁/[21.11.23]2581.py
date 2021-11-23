m = int(input())
n = int(input())

decimals = []

for i in range(m, n + 1):
    decimal = True
    for j in range(2, i):
        if i % j == 0:
            decimal = False
            break
    if decimal:
        decimals.append(i)

if len(decimals) == 0:
    print(-1)
else:
    if m <= 1:
        if n <= 1:
            print(-1)
        else:
            print(sum(decimals)-1)
            print(2)
    else:
        print(sum(decimals))
        print(min(decimals))