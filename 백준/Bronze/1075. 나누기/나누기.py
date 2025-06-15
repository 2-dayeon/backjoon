s = int(input())
n = int(input())
min = 0
for i in range(99,-1,-1):
    s = s//100 * 100
    s += i
    if s % n == 0:
        min = i
if min < 10:
    print(str('0') + str(min))
else:
    print(min)