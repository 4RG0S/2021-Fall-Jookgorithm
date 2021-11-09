import sys

n, m = map(int, sys.stdin.readline().rstrip().split())
node = []
for i in range(n):
    node.append(i+1)

parent = dict()
edge = []

def find(node):
  if parent[node] == node:
    return node
  parent[node] = find(parent[node])
  return parent[node]

def union(a, b):
  parent_a = find(a)
  parent_b = find(b)

  if parent_a < parent_b:
    parent[parent_b] = parent_a
  else:
    parent[parent_a] = parent_b

for item in node:
  parent[item] = item

for i in range(m):
  a, b, price = sys.stdin.readline().split()
  edge.append((int(price), int(a), int(b)))

edge.sort()
ans = 0

for price, a, b in edge:
  if find(a) == find(b):
    # 사이클이 생성된다는 소리
    continue

  union(a, b)
  ans += price

print(ans)
