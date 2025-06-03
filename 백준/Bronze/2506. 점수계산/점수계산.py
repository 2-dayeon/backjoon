n = int(input())
total = 0
li = list(map(int,input().split()))
cnt = 0
for s in li:
    if s == 1:
        cnt += 1
        total += cnt
    else :
        cnt = 0
print(total)