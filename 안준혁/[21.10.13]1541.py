nums = input()

stack = []

s = ''

con = False

plus = []
minus = []

for num in nums:
    if con:
        if num == '+':
            minus.append(s)
            s = ''
        elif num == '-':
            minus.append(s)
            s = ''
        else:
            s += num
    else:
        if num == '+':
            plus.append(s)
            s = ''
        elif num == '-':
            con = True
            plus.append(s)
            s = ''
        else:
            s += num
if con:
    minus.append(s)
else:
    plus.append(s)

sum = 0

for num in minus:
    sum -= int(num)
for num in plus:
    sum += int(num)

print(sum)