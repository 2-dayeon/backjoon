# 운동 a분 , 초기맥박 b , 최고맥박 c , 1분 운동후 상승 맥박 d , 1분 휴식후 하강 맥박 e
a,b,c,d,e = map(int,input().split())
cnt = 0
ing = b
long = 0
if b+d > c:
    print(-1)
else :
    while True:
        if cnt == a:
            break
        long += 1
        if ing + d <= c:
            cnt += 1
            ing += d
        else :
            if ing - e <= b :
                ing = b
            else :
                ing -= e
    print(long)