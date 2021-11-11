from collections import deque

S = input()

sentence = deque()

for c in S:
    sentence.append(c)

answer = ""
temp = []

while sentence:
    now = sentence.popleft()
    if now == '<':
        a = len(temp)
        for j in range(a):
            answer += temp[a - j - 1]
        temp = []
        answer += now
        while now != '>':
            now = sentence.popleft()
            answer += now
    elif now == ' ':
        a = len(temp)
        for j in range(a):
            answer += temp[a - j - 1]
        temp = []
        answer += ' '
    else:
        temp += now

a = len(temp)
for i in range(a):
    answer += temp[a - i - 1]

print(answer)
