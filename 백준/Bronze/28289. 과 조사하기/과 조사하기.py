r1 = 0
r2 = 0
r3 = 0
r4 = 0
n = int(input())
for i in range(n):
    a,b,c = map(int,input().split())
    if a == 1:
        r4 += 1
    elif b == 1 or b == 2:
        r1 += 1
    elif b == 3:
        r2 += 1
    else:
        r3 += 1
print(r1)
print(r2)
print(r3)
print(r4)