n = int(input())
for i in range(n):
    cnt = 0
    total = 0
    arr = input()
    for i in arr:
        if i == 'O':
            cnt += 1
            total += cnt
        else :
            cnt = 0
    print(total)