n = int(input())
for i in range(n):
    a,b = map(int,input().split())
    cnt = 1
    cnt2 = 1
    for j in range(b,0,-1):
        cnt2 *= j
    for k in range(a,0,-1):
        cnt *= k
    for h in range(b-a,0,-1):
        cnt *= h
    print(cnt2//cnt)