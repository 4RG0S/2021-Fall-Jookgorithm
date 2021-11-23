import sys
input = sys.stdin.readline

N, M = map(int, input().split())
nodes = [i for i in range(1, N+1)]

gh = []
dist = {}

for node in nodes:
  # gh[node] = []
  dist[str(node)] = float('inf')
# print(dist)

for _ in range(M):
  a, b, cost = input().rstrip().split()
  cost = int(cost)
  gh.append((a, b, cost))

# print(gh)

def cycle():
  for a, b, cost in gh:
    if dist[b] > cost + dist[a]:
      return True
  return False 

def bf(start):
  dist[str(start)] = 0
  
  for _ in range(N-1):
    for a, b, cost in gh:
      a = str(a)
      b = str(b)
      if dist[b] > dist[a] + cost:
        dist[b] = dist[a] + cost

bf(1);

if cycle():
  print("-1")
else:
  for i in range(2, N+1):
    print(dist[str(i)]) if dist[str(i)] != float("inf") else print("-1")