import sys
try:
    n1, n2, n12 = map(int, sys.stdin.readline().split())
except:
    sys.exit()
numerator = (n1 + 1) * (n2 + 1)
denominator = n12 + 1

N = (numerator // denominator) - 1

print(N)