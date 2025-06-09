all = []
max_m = []
for i in range(9):
    s = list(map(int,input().split()))
    all.append(s)
for i in all:
    max_m.append(max(i))
print(max(max_m))
for i in range(9):
    for j in range(9):
        if all[i][j] == max(max_m):
            print(i+1,j+1)