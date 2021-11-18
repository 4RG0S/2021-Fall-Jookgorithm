import sys
from collections import deque

next = ""
answers = []
d = deque()

while next != ".":
    say = "yes"
    next = sys.stdin.readline().rstrip()
    if next == ".":
        break
    for c in next:
        if c == '(':
            d.append(c)
        elif c == '[':
            d.append(c)
        elif c == ')':
            if len(d) != 0:
                if d.pop() != '(':
                    say = "no"
                    break
            else:
                say = "no"
                break
        elif c == ']':
            if len(d) != 0:
                if d.pop() != '[':
                    say = "no"
                    break
            else:
                say = "no"
                break
    if len(d) != 0:
        say = "no"
    answers.append(say)
    d.clear()

for answer in answers:
    print(answer)
