import sys

n = int(sys.stdin.readline())

data = list()

for _ in range(n):
    data.append(int(sys.stdin.readline()))

data.sort()

for i in range(n):
    print(data[i])
