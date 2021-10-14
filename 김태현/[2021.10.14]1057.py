N, a, b = list(map(int, input().split()))
number = [a, b]
number.sort()
r = 1

while True:
    if number[1] % 2 == 0:
        if number[1] - 1 == number[0]:
            break
    for i in range(2):
        if number[i] % 2 == 1:
            number[i] = number[i] + 1
            number[i] = int(number[i] / 2)
        else:
            number[i] = int(number[i] / 2)
    r = r + 1

print(r)

