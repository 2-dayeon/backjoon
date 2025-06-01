a,b,c,d = map(int,input().split())
cnt1 = c-a
cnt2 = d-b
cnt3 = min(a,b,c,d)
print(min(cnt1,cnt2,cnt3))