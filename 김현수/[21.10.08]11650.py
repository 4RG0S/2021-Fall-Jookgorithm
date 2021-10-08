import sys

n = int(sys.stdin.readline().rstrip())

data = []
for _ in range(n):
    [x,y] = map(int, sys.stdin.readline().rstrip().split())
    data.append([x,y])

data.sort(key = lambda x : (x[0], x[1]))

for item in data:
    x, y = item[0], item[1]
    print(x, y)
    
