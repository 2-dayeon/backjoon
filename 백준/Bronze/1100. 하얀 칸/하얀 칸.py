all = []
cnt = 0
for i in range(8):
    li = []
    s = input()
    for j in s:
        li.append(j)
    all.append(li)
for i in range(1,9):
    for j in range(1,9):
        if i%2 == 1 and j%2 == 1:
            if all[i-1][j-1] == 'F':
                cnt += 1
        elif i%2 == 0 and j%2 == 0:
            if all[i-1][j-1] == 'F':
                cnt += 1
print(cnt)