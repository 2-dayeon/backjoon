n = int(input())
cnt = 0
sum = 0
while cnt//n < n-1:
    cnt += n+1
    sum += cnt
print(sum)