a,b,c = map(int,input().split())
cnta , cntb , cntc = 0,0,0
cnt = 0
while True:
    if cnta == a and cntb == b and cntc == c:
        break
    else :
        cnt += 1
        cnta = (cnt-1)%15 +1
        cntb = (cnt-1)%28 +1
        cntc = (cnt-1)%19 +1
print(cnt)