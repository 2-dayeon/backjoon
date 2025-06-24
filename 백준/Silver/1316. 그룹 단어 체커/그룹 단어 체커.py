n = int(input())
cc = 0
for i in range(n):
    cnt = 1
    s = input()
    ch = s[0]
    lis = set(s)
    for i in s:
        if i != ch:
            ch = i
            cnt += 1
    if cnt > len(lis):
        a = 0
    else :
        cc += 1
print(cc)