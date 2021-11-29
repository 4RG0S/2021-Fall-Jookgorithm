a, b = map(int, input().split())

tempA = a
tempB = b
while b > 0:
    a, b = b, a % b

print(a)

gcd = a
a = tempA
b = tempB

print(a * b // gcd)
