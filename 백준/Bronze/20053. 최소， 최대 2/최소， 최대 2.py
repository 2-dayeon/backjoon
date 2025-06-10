n = int(input())
for i in range(n):
    s = int(input())
    li = list(map(int,input().split()))
    print(min(li),max(li))