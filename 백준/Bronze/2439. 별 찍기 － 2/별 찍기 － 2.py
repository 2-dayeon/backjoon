n = int(input())

for i in range(n-1,-1,-1):
    for j in range(i):
        print(' ',end='')
    for h in range(n-i):
        print('*',end='')
    print()
 