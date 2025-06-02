li = []
cnt = 0
for i in range(10):
    a,b = map(int,input().split())
    cnt += (b-a)
    li.append(cnt)
print(max(li))