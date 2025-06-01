a,b,c = map(int,input().split())
n = int(input())
c += n
b += c//60
c = c%60
a += b//60
b = b%60
if a >= 24:
    cnt = a//24
    a -= 24*cnt
print(a,b,c)