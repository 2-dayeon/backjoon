n = int(input())
for i in range(n-1,-1,-1):
    for h in range(i):
        print(' ',end='')
    for j in range(n-i):
        print('*',end='')
    print()
for i in range(1,n): 
    for h in range(i):
        print(' ',end='')
    for j in range(n-i):
        print('*',end='')
    print()