n = int(input())
max_max = []
for i in range(n):
    max_li = []
    li = list(map(int,input().split()))
    for i in li:
        max_li.append(li.count(i))
    if max(max_li) == 3:
        max_max.append(10000+li[0]*1000)
    elif max(max_li) == 2:
        max_max.append(1000+li[max_li.index(2)]*100)
    else:
        max_max.append(max(li)*100)
print(max(max_max))