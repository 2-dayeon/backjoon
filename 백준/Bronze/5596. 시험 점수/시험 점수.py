s = list(map(int,input().split()))
cnt = 0
t = list(map(int,input().split()))
cnt2 = 0
for i in s:
    cnt += i
for i in t:
    cnt2 += i
print(max(cnt,cnt2))