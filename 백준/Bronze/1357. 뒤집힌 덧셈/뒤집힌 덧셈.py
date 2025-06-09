a,b = input().split()
x,y = '',''
t = []
for i in range(len(a)-1,-1,-1):
    x += a[i]
for i in range(len(b)-1,-1,-1):
    y += b[i]
sum = str(int(x) + int(y))
for i in range(len(sum)-1,-1,-1):
    t.append(sum[i])
while t[0] == '0':
    t.remove('0')
for i in t:
    print(i,end='')