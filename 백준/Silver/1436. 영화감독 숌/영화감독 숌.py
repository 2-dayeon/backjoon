li = '666'
n = int(input())
a = '666'
cnt = 0
while True :
    if cnt == n:
        print(int(a)-1)
        break
    if li in a:
        cnt += 1
    a = int(a) + 1
    a = str(a)