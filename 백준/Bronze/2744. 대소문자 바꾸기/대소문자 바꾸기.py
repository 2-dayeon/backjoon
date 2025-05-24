d = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
so = 'abcdefghijklmnopqrstuvwxyz'
s = list(input())
for i in range(len(s)):
    if s[i] in d:
        s[i] = s[i].lower()
    elif s[i] in so:
        s[i] = s[i].upper()
for i in s:
    print(i,end='')