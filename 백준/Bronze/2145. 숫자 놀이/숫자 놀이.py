while True:
    s = int(input())
    if s == 0:
        break
    cnt = 0
    while True:
        cnt += s%10
        s //= 10
        if s < 10:
            cnt += s
            if cnt >= 10:
                s = cnt
                cnt = 0
            else:
                print(cnt)
                break
