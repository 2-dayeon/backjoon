s = input()
a = 1
new_num = s
while True:
    if int(new_num) < 10:
        new_num = '0' + new_num
    num = str(int(new_num[0])+int(new_num[1]))
    new_num = new_num[-1]+num[-1]
    if new_num[0] == '0':
        new_num = int(new_num)
        if new_num == int(s):
            print(a)
            break
        else :
            new_num = str(new_num)
            a+=1
    else:
        if new_num == s:
            print(a)
            break
        else :
            a += 1