a,b = map(int,input().split())
n = int(input())

if b+n < 60:
    print(a,b+n)

elif b+n >= 60:
    a += (b+n)//60 
    if a > 23:
        print(a-24,(b+n)%60)
    else:
        print(a,(b+n)%60)