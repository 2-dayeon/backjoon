cnt = 0
num_li = []
a = int(input())
b = int(input())
for i in range(a,b+1):
    for j in range(1,101):
        if j*j == i:
            num_li.append(i)
if len(num_li) == 0:
    print(-1)
else :
    for i in num_li:
        cnt += i
    print(cnt)
    print(min(num_li))