la = []
lb = []
a,b = map(int,input().split())
for i in range(a):
    n = list(map(int,input().split()))
    la.append(n)
for i in range(a):
    n = list(map(int,input().split()))
    lb.append(n)
for i in range(a):
    for j in range(b):
        la[i][j] += lb[i][j]
for i in la:
    for j in i:
        print(j,end=' ')
    print()