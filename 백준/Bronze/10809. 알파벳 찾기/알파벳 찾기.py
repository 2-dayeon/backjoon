chr = 'abcdefghijklmnopqrstuvwxyz'
s = input()
lst = []
for i in range(len(chr)):
    lst.append(-1)
for i in range(len(s)):
    for j in range(len(chr)):
        if s[i] == chr[j]:
            if lst[j] == -1:
                lst[j] = i
for i in lst:
    print(i,end=' ')