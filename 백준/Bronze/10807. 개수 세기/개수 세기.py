n = int(input())
a = input().split()
c = int(input())
cnt = 0

for i in a:
    if c == int(i):
        cnt += 1
print(cnt)