import sys
from collections import deque

def bfs(u, v):
    q = deque([])

    visit = dict()
    for key in prev_node.keys():
        visit[key] = False

    q.append(u)
    visit[u] = True

    while q:
        node = q.popleft()

        for next_node in graph[node]:
            if (node, next_node) not in degree:
                continue

            move_flow = degree[(node, next_node)]
            if not visit[next_node] and move_flow > 0:
                visit[next_node] = True
                prev_node[next_node] = node
                q.append(next_node)

    return visit[v]

def ford_fulkerson(start, end):
    max_flow = 0

    while bfs(start, end):
        
        temp_flow = float('inf')
        temp_node = end
        while temp_node != start:
            temp_start_node = prev_node[temp_node]
            temp_flow = min(temp_flow, degree[(temp_start_node, temp_node)])
            temp_node = temp_start_node


        temp_node = end
        while temp_node != start:
            temp_start_node = prev_node[temp_node]
            degree[(temp_start_node, temp_node)] -= temp_flow
            degree[(temp_node, temp_start_node)] += temp_flow
            temp_node = temp_start_node


        max_flow += temp_flow

    return max_flow

n = int(sys.stdin.readline())
degree, graph, prev_node = dict(), dict(), dict()

for _ in range(n):
    a, b, c = sys.stdin.readline().split()

    if a not in graph:
        graph[a] = []
    if b not in graph:
        graph[b] = []

    if (a, b) not in degree:
        degree[(a, b)] = 0
    if (b, a) not in degree:
        degree[(b, a)] = 0

    degree[(a, b)] += int(c)
    degree[(b, a)] += int(c)
    graph[a].append(b)
    graph[b].append(a)
    prev_node[a] = None
    prev_node[b] = None

print(ford_fulkerson('A', 'Z'))
