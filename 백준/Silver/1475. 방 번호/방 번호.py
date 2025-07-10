n = input()
li= ['0','1','2','3','4','5','6','7','8','9']
li2 = []
for i in li:
    if i == '9' or i == '6' :
        c69 = n.count('6') + n.count('9')
        if c69%2 != 0:
            li2.append(c69//2 + 1)
        else :
            li2.append(c69//2)
    else :
        li2.append(n.count(i))
print(max(li2))