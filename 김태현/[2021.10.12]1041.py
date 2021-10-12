N = int(input())
c = list(map(int, input().split()))

if N == 1:
    c.sort()
    print(c[0] + c[1] + c[2] + c[3] + c[4])
    exit()

a3l = [[0, 1, 2], [0, 1, 3], [0, 2, 4], [0, 3, 4], [5, 1, 2], [5, 1, 3], [5, 2, 4], [5, 3, 4]]
a2l = [[0, 1], [0, 2], [0, 3], [0, 4], [5, 1], [5, 2], [5, 3], [5, 4], [1, 2], [1, 3], [2, 4], [3, 4]]
b = []

a3 = c[0] + c[1] + c[2]
for ls in a3l[1:]:
    b = [c[i] for i in ls]
    a3 = min(a3, b[0] + b[1] + b[2])
a2 = c[0] + c[1]
for ls in a2l[1:]:
    b = [c[i] for i in ls]
    a2 = min(a2, b[0] + b[1])
a1 = min(c)
print(a1 * (4 * (N - 1) * (N - 2) + (N - 2) * (N - 2)) + a2 * (4 * (2 * N - 3)) + 4* a3)
