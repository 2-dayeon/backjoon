n = int(input())
li = []
for i in range(n):
    s = int(input())
    li.append(s)
lis = set(li)
for i in sorted(lis):
    print(i)