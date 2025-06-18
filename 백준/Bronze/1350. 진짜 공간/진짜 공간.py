cnt = 0
a = int(input())
b = list(map(int,input().split()))
c = int(input())
for i in b:
    n = 1
    if i == 0:
        cnt = cnt
    else :
        if i == c*((i//c)):
            cnt += c*((i//c))
        else :
            cnt += c*(n+(i//c))
print(cnt)