s = input()
a = s.split("-")
b = []

for i in a:
    c = list(map(int, i.split("+")))
    b.append(sum(c))

answer = b[0]

for i in b[1:]:
    answer = answer - i

print(answer)
