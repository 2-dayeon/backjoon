n,m = map(int,input().split())
r = []
for i in range(n):
    r.append(0)

for i in range(m):
    a,b,c = map(int,input().split())
    for j in range(a,b+1):
        j -= 1
        r[j] = c

for i in r:
    print(i,end=' ')