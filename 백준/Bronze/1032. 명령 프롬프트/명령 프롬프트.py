n = int(input())
all = []
for i in range(n):
    r = []
    s = input()
    for j in s:
        r.append(j)
    all.append(r)
for i in range(len(all[0])):
    cnt = 0
    for j in range(n):
        if all[0][i] == all[j][i]:
            cnt += 1
    if cnt == n:
        print(all[0][i],end='')
    else :
        print('?',end='')