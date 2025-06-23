while True:
    cnt = 0
    s = input()
    if s == '0':
        break
    else :
        for i in range(len(s)//2+1):
            if s[i] == s[-1*(i+1)]:
                cnt += 1
    if cnt == len(s)//2+1:
        print('yes')
    else :
        print('no')