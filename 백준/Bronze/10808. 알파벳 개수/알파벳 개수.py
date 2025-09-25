char = []
num = []
for i in range(97,123,1) :
    char.append(chr(i))
    num.append(0)

s = input()
arr = []
for i in range(len(s)) :
    arr.append(s[i])

for i in range(len(arr)) :
    for j in range(len(char)) :
        if arr[i] == char[j] :
            num[j] += 1
print(*num)