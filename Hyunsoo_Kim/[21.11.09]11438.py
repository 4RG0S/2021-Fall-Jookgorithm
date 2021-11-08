import sys
sys.setrecursionlimit(int(1e5))
LOG = 21

input = sys.stdin.readline

N = int(input())
parent = [[0]*LOG for _ in range(N+1)]
d = [0] * (N+1)
c = [0] * (N+1)
gh = [[] for _ in range(N+1)]

for _ in range(N-1):
  a, b = map(int, input().split())
  gh[a].append(b)
  gh[b].append(a)

def dfs(x, depth):
  c[x] = True
  d[x] = depth
  for y in gh[x]:
    if c[y]:
      continue
    parent[y][0] = x
    dfs(y, depth+1)

def set_parent():
  dfs(1, 0)
  for i in range(1, LOG):
    for j in range(1, N+1):
      parent[j][i] = parent[parent[j][i-1]][i-1]

def lca(a, b):
  # b가 더 깊도록 설정
  if d[a] > d[b]:
    a, b = b, a
  
  #노드간 깊이가 같도록 설정
  for i in range(LOG-1, -1, -1):
    if d[b] - d[a] >= (1 << i): # 2^i
      b = parent[b][i]
    
  if a == b:
    return a;
  
  for i in range(LOG-1, -1, -1):
    if parent[a][i] != parent[b][i]:
      a = parent[a][i]
      b = parent[b][i]
  
  return parent[a][0]

set_parent()
M = int(input())

for i in range(M):
  a, b = map(int, input().split())
  print(lca(a, b))
