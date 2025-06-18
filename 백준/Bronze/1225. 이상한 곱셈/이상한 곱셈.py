a,b = input().split()
lia = [int(a[i]) for i in range(len(a))]
lib = [int(b[i]) for i in range(len(b))]

print(sum(lia) * sum(lib))