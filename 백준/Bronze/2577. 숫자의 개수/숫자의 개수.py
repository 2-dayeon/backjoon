a = int(input())
b = int(input())
c = int(input())

s = str(a*b*c)

for i in range(10):
  i = str(i)
  print(s.count(i))