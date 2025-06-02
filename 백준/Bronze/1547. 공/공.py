n = int(input())
li = [1,2,3]
for i in range(n):
    a,b = map(int,input().split())
    li[a-1],li[b-1] = li[b-1],li[a-1]
print(li.index(1)+1)