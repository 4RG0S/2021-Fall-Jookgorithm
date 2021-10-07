n, new, p = map(int, input().split())

if n == 0:
    print(1)

else:
    arr = list(map(int, input().split()))

    arr.sort(reverse=True)
    if p > n:
        if arr[len(arr) - 1] > new:
            print(n+1)
        else:
            for i in range(len(arr)):
                if arr[i] <= new:
                    print(i + 1)
                    break
    else:
        if arr[p - 1] >= new:
            print(-1)
        else:
            for i in range(len(arr)):
                if arr[i] <= new:
                    print(i + 1)
                    break



