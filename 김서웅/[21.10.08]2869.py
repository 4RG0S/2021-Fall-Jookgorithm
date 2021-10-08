a, b, c = map(int, input().split())

d = ((c-b) // (a-b))
e = ((c-b) % (a-b))

if(e != 0):
    d = d + 1

print(d)