a,b = map(int,input().split())
cnt = 0
num = 0
li = []
while num < a:
    cnt += 1
    if str(b) not in str(cnt):
        li.append(cnt)
        num += 1
print(li[-1])