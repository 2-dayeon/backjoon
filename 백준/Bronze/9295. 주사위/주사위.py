n = int(input())
for i in range(n):
    cnt = 0
    s = list(map(int,input().split()))
    for j in s:
        cnt += j
    print(f"Case {i+1}: {cnt}")