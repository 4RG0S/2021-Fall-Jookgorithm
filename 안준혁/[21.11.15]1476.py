e, s, m = map(int, input().split())

a = 1
nowE = 1
nowS = 1
nowM = 1

while(True):
    if nowE == 16:
        nowE = 1
    if nowS == 29:
        nowS = 1
    if nowM == 20:
        nowM = 1
    if e == nowE and s == nowS and m == nowM:
        break
    a += 1
    nowE += 1
    nowS += 1
    nowM += 1

print(a)