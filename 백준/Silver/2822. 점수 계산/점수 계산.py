li = []
li2 = []
li3 = []
cnt = 0
for i in range(8):
    n = int(input())
    li.append(n)
li2 = li[:]
li2.sort(reverse=True)
for i in range(5):
    cnt += li2[i]
print(cnt)
for i in range(5):
    li3.append(li.index(li2[i])+1)
li3.sort()
print(*li3)