s = input()
cnt = 0
if s == 'F':
    cnt = 0.0
else:
    if s[0] == 'A':
        cnt += 5
    elif s[0] == 'B':
        cnt += 4
    elif s[0] == 'C':
        cnt += 3
    else :
        cnt += 2
    if s[1] == '+':
        cnt -= 0.7
    elif s[1] == '0':
        cnt -= 1.0
    else :
        cnt -= 1.3
    if s == 'F':
        cnt = 0.0
print(cnt)