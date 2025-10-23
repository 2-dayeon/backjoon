import sys

data = sys.stdin.read().split()

n = int(data[0])
m = int(data[1])

s = [0] * (n + 1)

sum = 0
for i in range(n):
    sum += int(data[i + 2])
    s[i + 1] = sum

results = []

for k in range(m):
    a = int(data[2 + n + 2 * k])
    b = int(data[2 + n + 2 * k + 1])
    
    cnt = s[b] - s[a - 1]
    
    results.append(str(cnt))

sys.stdout.write('\n'.join(results) + '\n')