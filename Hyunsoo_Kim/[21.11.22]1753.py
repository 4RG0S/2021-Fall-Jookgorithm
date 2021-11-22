import sys
import heapq

input = sys.stdin.readline

V, E = map(int, input().split())
start = input().rstrip()

nodes = [i for i in range(1, V+1)]

gh = {}
dist = {}

for node in nodes:
  gh[str(node)] = []
  dist[str(node)] = float('inf')
  
for _ in range(E):
  a, b, cost = input().rstrip().split()
  cost = int(cost)
  gh[a].append((cost, b))


def dijkstart(start):
  q = []
  
  heapq.heappush(q, (0, start))
  dist[start] = 0
  while q:
    cost, now = heapq.heappop(q)
    
    if dist[now] < cost:
      continue
    
    for next_cost, next_node in gh[now]:
      tmp_cost = cost + next_cost
      
      if tmp_cost < dist[next_node]:
        dist[next_node] = tmp_cost
        heapq.heappush(q, (tmp_cost, next_node))

dijkstart(start)

for val in dist.values():
  if val == float('inf'):
    print("INF")
  else:
    print(val)