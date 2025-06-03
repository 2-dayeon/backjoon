h = []
cnt = 0
for i in range(7):
    n = int(input())
    if n%2 == 1:
        h.append(n)
        cnt += n
if len(h) == 0:
    print(-1)
else :
    print(cnt)
    print(min(h))