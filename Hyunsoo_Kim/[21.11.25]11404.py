import sys

input = sys.stdin.readline

n = int(input())
m = int(input())
# nodes = [i for i in range(1, n+1)]
data = [[int(1e9)]*(n+1) for _ in range(n+1)]

# for node in nodes:
#   gh[node] = []
# print(nodes)

for _ in range(m):
  a, b, c = map(int, input().split())
  data[a][b] = min(data[a][b], c)

for i in range(n + 1):
    data[i][i] = 0

for mid in range(1, n + 1):
  for a in range(1, n + 1):
    for b in range(1, n + 1):
      data[a][b] = min(data[a][mid] + data[mid][b], data[a][b])

for i in range(1, n+1):
    for j in range(1, n+1):
        if data[i][j] == int(1e9):
            print(0, end=" ")
        else:
            print(data[i][j], end=" ")
    print()
