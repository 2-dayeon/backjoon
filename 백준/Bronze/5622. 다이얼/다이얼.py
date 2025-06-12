ch = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
s = input()
cnt = 0
for i in s:
    for j in range(8):
        if i in ch[j]:
            cnt += 3+j
print(cnt)