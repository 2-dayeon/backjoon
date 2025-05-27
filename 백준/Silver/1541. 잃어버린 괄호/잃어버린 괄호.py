math = input()
m = 1
fer = ""
last = 0
for i in math:
    if i == '+':
        last += int(fer)*m
        fer = ''
    elif i == '-':
        last += int(fer)*m
        m = -1
        fer = ''
    else :
        fer += i
print(last + int(fer) * m)