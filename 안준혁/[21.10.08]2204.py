answers = []

while True:
    given = int(input())
    if given == 0:
        break
    words = []
    for i in range(given):
        words.append(input())
    words.sort(key= lambda  x: x.lower())
    answers.append(words[0])

for answer in answers:
    print(answer)