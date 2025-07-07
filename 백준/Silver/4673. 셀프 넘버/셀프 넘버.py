li = []
cnt = '1'
a = '1'
while int(a) <= 10000:
    a = str(a)
    for i in cnt:
        cnt = int(cnt)
        cnt += int(i)
    li.append(cnt)
    cnt = a
    cnt = str(cnt)
    a = int(a) + 1
for i in range(1,10001,1):
    if i not in li:
        print(i)