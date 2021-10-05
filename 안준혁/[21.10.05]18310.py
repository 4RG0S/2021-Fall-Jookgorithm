n = int(input())

given = list(map(int, input().split()))
given.sort()

print(given[(n-1)//2])