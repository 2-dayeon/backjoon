n = int(input())

for i in range(1,n+1):
    for j in range(i):
        print('*',end='')
    for k in range(n-i):
        print(' ',end='')
        print(' ',end='')
    for h in range(n-(n-i)):
        print('*',end='')
    print()

for i in range(n-1,-1,-1):
    for j in range(i):
        print('*',end='')
    for k in range(n-i):
        print(' ',end='')
        print(' ',end='')
    for h in range(n-(n-i)):
        print('*',end='')
    print()