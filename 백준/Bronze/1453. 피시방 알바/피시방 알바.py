n = int(input())
cnt = 0
li = list(map(int,input().split()))
reset = set(li)
for i in reset:
    if li.count(i) > 1:
        cnt += li.count(i)-1
print(cnt)