all = []
li = []
n = int(input())
for i in range(n):
    s = input()
    li.append(s)
li.sort()
lich = sorted(li,key=len)
for i in lich:
    if i not in all :
        all.append(i)
for i in all:
    print(i)