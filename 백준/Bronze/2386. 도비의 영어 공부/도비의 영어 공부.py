while True:
    cnt = 0
    s = input()
    s = s.lower()
    if s == '#':
        break
    else :
        for i in range(1,len(s)):
            if s[0] == s[i]:
                cnt += 1
        print(s[0], cnt)