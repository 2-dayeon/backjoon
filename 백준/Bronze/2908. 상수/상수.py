a,b = input().split()
lia,lib = [],[]
for i in range(2,-1,-1):
    lia.append(a[i])
    lib.append(b[i])
a,b = '',''
for i in lia:
    a += str(i)
for i in lib:
    b += str(i)
print(max(int(a),int(b)))