s = input()
cnt = 0
for i in range(len(s)):
    if i!= len(s)-1 and s[i+1] == '0' and s[i] == '1':
        cnt += 10
    else :
        cnt += int(s[i])
print(cnt)