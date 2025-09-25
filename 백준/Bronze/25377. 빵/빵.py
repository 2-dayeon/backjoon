n = int(input())
li = []
for i in range(n) :
    a,b = map(int,input().split(" "))
    if b-a >= 0 :
        li.append(b)
if len(li) == 0:
    print(-1)
else :
    print(min(li))