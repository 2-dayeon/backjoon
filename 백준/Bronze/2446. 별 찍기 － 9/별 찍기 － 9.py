n = int(input())

for i in range(n):
    for j in range(i):
        print(' ',end='')
    for h in range(n-i):
        print('*',end='')
    for k in range(n-(i+1)):
        print('*',end='')
    print()

for i in range(n-1,0,-1):
    for j in range(i-1):
        print(' ',end='')
    for k in range(n-i+1):
        print('*',end='')
    for h in range(n-i):
        print('*',end='')
    print()