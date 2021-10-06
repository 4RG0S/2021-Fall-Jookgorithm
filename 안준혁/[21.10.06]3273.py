n = int(input())

seq = list(map(int, input().split()))

seq.sort()

x = int(input())

left = 0
right = n - 1

ans = 0

while left < right:
    tmp = seq[left] + seq[right]
    if tmp < x:
        left += 1
    elif tmp > x:
        right -= 1
    else:
        ans += 1
        left += 1
        right -= 1

print(ans)