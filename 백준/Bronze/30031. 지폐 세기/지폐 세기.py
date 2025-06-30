n = int(input())
cnt = 0
for i in range(n):
    a,b = map(int,input().split())
    if a == 136 :
        cnt += 1000
    elif a == 142 :
        cnt += 5000
    elif a == 148:
        cnt += 10000
    elif a == 154 :
        cnt += 50000
print(cnt)