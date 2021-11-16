import sys

H, W = map(int, sys.stdin.readline().split())
waterList = list(map(int, sys.stdin.readline().split()))
ans=0
for i in range(1, W-1):
    left = max(waterList[:i])
    right = max(waterList[i+1:])
    tmp = min(left, right)
    if(waterList[i]<tmp):
        ans += tmp-waterList[i]

print(ans)
