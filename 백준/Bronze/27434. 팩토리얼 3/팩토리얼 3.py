n = int(input())
cnt = 1
if n == 0:
    print(1)
else:
    for i in range(1,n+1):
        cnt *= i
    print(cnt)