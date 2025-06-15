li = []
for i in range(1,46):
    for j in range(1,i+1):
        li.append(i)
a,b = map(int,input().split())
cnt = 0
for i in range(a-1,b):
    cnt += li[i]
print(cnt)