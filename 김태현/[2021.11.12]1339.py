N = int(input())
words = []
for i in range(N):
    words.append(input())

char = []
nums = []

for i in range(N):
    for j in range(len(words[i])):
        if words[i][j] in char:
            n = char.index(words[i][j])
            nums[n] += 10 ** (len(words[i]) - j - 1)
        else:
            char.append(words[i][j])
            nums.append(0)
            nums[len(char) - 1] += 10 ** (len(words[i]) - j - 1)

nums.sort(reverse=True)

answer = 0

for i in range(len(nums)):
    answer += (9 - i) * nums[i]

print(answer)
