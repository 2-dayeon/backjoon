all = []
n = int(input())
for i in range(n):
    r = []
    a,b = map(int,input().split())
    r.append(a)
    r.append(b)
    all.append(r)
all.sort()
for i in all:
    print(*i)