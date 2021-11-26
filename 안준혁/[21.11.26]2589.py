from collections import deque
import sys
input = sys.stdin.readline

N, M = map(int, input().split())

treasureMap = []

for _ in range(N):
    treasureMap.append(list(input()))

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

far = 0

for i in range(N):
    for j in range(M):
        if treasureMap[i][j] == 'L':
            q = deque()
            q.append((i, j))
            visited = [[0] * M for _ in range(N)]
            visited[i][j] = 1
            nowFar = 0
            while q:
                nowY, nowX = q.popleft()
                for k in range(4):
                    nextY = dy[k] + nowY
                    nextX = dx[k] + nowX
                    if 0 <= nextY < N and 0 <= nextX < M:
                        if treasureMap[nextY][nextX] == 'L' and visited[nextY][nextX] == 0:
                            visited[nextY][nextX] = visited[nowY][nowX] + 1
                            q.append((nextY, nextX))
                            nowFar = max(nowFar, visited[nextY][nextX])
            far = max(nowFar - 1, far)

print(far)