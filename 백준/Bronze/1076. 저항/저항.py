c = ''
for i in range(2):
    s = input()
    if s == 'black':
        c += '0'
    elif s == 'brown':
        c += '1'
    elif s == 'red':
        c += '2'
    elif s == 'orange':
        c += '3'
    elif s == 'yellow':
        c += '4'
    elif s == 'green':
        c += '5'
    elif s == 'blue':
        c += '6'
    elif s == 'violet':
        c += '7'
    elif s == 'grey':
        c += '8'
    else :
        c += '9'
c = int(c)
s = input()
if s == 'black':
    print(c)
elif s == 'brown':
   print(c*10)
elif s == 'red':
    print(c*100)
elif s == 'orange':
    print(c*1000)
elif s == 'yellow':
    print(c*10000)
elif s == 'green':
    print(c*100000)
elif s == 'blue':
    print(c*1000000)
elif s == 'violet':
    print(c*10000000)
elif s == 'grey':
    print(c*100000000)
else :
    print(c*1000000000)