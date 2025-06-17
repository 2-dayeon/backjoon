s = input() #zZa
s = s.upper() # ZZA
one_s = set(s) #ZA
one_s = list(one_s)
li = [s.count(i) for i in one_s] # 2 1
maxco = max(li) #2
max_count = []
for i in range(len(li)):
    if li[i] == maxco:
        max_count.append(one_s[i])
if len(max_count) == 1:
    print(max_count[0])
else :
    print('?')