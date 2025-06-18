cnt = 0
cnt2 = 0
per = 0
a,b,c = map(int,input().split(':'))
aa,bb,cc = map(int,input().split(':'))
cnt = a*3600 + b*60 + c
cnt2 = aa*3600 + bb*60 + cc
per = cnt2 - cnt
if per < 0:
    x = 24+(per//3600)
    y = (per%3600)//60
    z = (per%3600)%60
    if x < 10:
        x = '0'+str(x)
    if y < 10:
        y = '0'+str(y)
    if z < 10:
        z = '0'+str(z)
    print(f"{x}:{y}:{z}")
else :
    x = per//3600
    y = (per%3600)//60
    z = (per%3600)%60
    if x < 10:
        x = '0'+str(x)
    if y < 10:
        y = '0'+str(y)
    if z < 10:
        z = '0'+str(z)
    print(f"{x}:{y}:{z}")