n = int(input())
all_f = []
five = []
for i in range(n):
    s = input()
    all_f.append(s[0])
dan_f = set(all_f)
for i in dan_f:
    if all_f.count(i) >= 5:
        five.append(i)
five.sort()
if len(five) >= 1:
    for i in five:
        print(i,end='')
else :
    print('PREDAJA')