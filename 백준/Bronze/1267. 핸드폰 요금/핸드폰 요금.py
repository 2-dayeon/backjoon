Y = 0
M = 0
n = int(input())
s = list(map(int,input().split()))
for i in s:
    Y += (i//30+1)*10
    M += (i//60+1)*15
min = min(Y,M)
if Y == M:
    print('Y','M',min)
elif min == Y:
    print("Y",min)
else :
    print("M",min)