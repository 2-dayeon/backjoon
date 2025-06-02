n = int(input())
cnt = 0
for i in range(n-1):
    s = int(input())
    cnt += s-1
s = int(input())
print(cnt+s)