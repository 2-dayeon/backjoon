two = [2,4,8,6]
three = [3, 9, 7, 1]
four = [4,6]
seven = [7,9,3,1]
eigh = [8,4,2,6]
nine = [9,1]
n = int(input())
for i in range(n):
    a,b = map(int,input().split())
    a %= 10
    b -= 1
    if a == 1:
        print(1)
    elif a == 5 :
        print(5)
    elif a == 6:
        print(6)
    elif a == 0:
        print(10)
    elif a == 2:
        print(two[b%len(two)])
    elif a == 3:
        print(three[b%len(three)])
    elif a == 4:
        print(four[b%len(four)])
    elif a == 7:
        print(seven[b%len(seven)])
    elif a == 8:
        print(eigh[b%len(eigh)])
    else:
        print(nine[b%len(nine)])