for i in range(3):
    cnt = 0
    cnt2 = 0
    a,b,c,d,e,f = map(int,input().split())
    cnt += a*3600 + b*60 + c
    cnt2 += d*3600 + e*60 + f
    cnt2 -= cnt
    x = cnt2//3600
    y = (cnt2%3600)//60
    z = (cnt2%3600)%60
    print(x,y,z)