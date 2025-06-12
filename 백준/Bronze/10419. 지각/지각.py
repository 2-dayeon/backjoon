n = int(input())
max_s = 0
for i in range(n):
    s = int(input())
    for i in range(s):
        if i + i**2 <= s:
            max_s = i
        else :
            break
    print(max_s)