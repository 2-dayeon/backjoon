for i in range(3):
    cnt = 0
    n = int(input())
    for j in range(n):
        s = int(input())
        cnt += s
    if cnt == 0:
        print(0)
    elif cnt < 0:
        print('-')
    else :
        print('+')