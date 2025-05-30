str = 'aeiouAEIOU'
while True:
    cnt = 0
    s = input()
    if s == '#':
        break
    else :
        for i in s:
            if i in str:
                cnt += 1
    print(cnt)