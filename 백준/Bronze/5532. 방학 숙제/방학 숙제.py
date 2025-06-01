d = int(input())
k = int(input())
m = int(input())
dk = int(input())
dm = int(input())
xdk = k//dk
xdm = m//dm
if k%dk != 0:
    xdk += 1
if m%dm != 0:
    xdm += 1
print(d-max(xdk,xdm))