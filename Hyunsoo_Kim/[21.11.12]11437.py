import sys
sys.setrecursionlimit(int(1e5))


N = int(sys.stdin.readline().rstrip())
#node 갯수
parent = [0] * (N+1) # 부모 노드 정보
d = [0] * (N+1) # 각 노드까지의 깊이
c = [0] * (N+1) # 각 노드의 깊이가 계산되었는지 여부
gh = [[]for _ in range(N+1)]

for i in range(N-1):
  node1, node2 = map(int, sys.stdin.readline().split())
  gh[node1].append(node2)
  gh[node2].append(node1)


def dfs(x, depth):
  c[x] = True
  d[x] = depth
  for y in gh[x]:
    if c[y]:
      continue
    parent[y] = x
    dfs(y, depth+1)


def lca(a, b):
  while d[a] != d[b]:
    if d[a] > d[b]:
      a = parent[a]
    else:
      b = parent[b]
    
  while a != b:
    a = parent[a]
    b = parent[b]
  return a

dfs(1, 0)
M = int(sys.stdin.readline().rstrip())
#질문 쿼리 갯수
for i in range(M):
  a, b = map(int, sys.stdin.readline().rstrip().split())
  print(lca(a,b))



