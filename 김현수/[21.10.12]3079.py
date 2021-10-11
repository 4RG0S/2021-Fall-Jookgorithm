import sys

N, M = map(int, sys.stdin.readline().rstrip().split())
judge = []
for _ in range(N):
  judge.append(int(sys.stdin.readline().rstrip()))


judge.sort()
print(judge)
# judge = judge.sort()

# max_judge = judge[-1]
# start = judge[0]
# answer = end = max_judge*M

start = min(judge)
answer = end = max(judge)*M

while start <= end:
  total = 0
  mid = (start + end) // 2
  for i in range(N):
    total += mid // judge[i]
  print(total)
  if total >= M: 
    #최소값을 찾아야하므로 값이 같아도 계속해서
    #end의 값을 mid-1로 이동.
    end = mid - 1
    answer = min(answer, mid)
  else:
    start = mid + 1

print(answer)