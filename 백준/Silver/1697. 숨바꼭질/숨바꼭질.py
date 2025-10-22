from collections import deque

def bfs(N, K):
    MAX = 100000
    v = [0]*(MAX+1)
    q = deque([(N,0)])
    v[N] = 1
    while q:
        x,t = q.popleft()
        if x == K: return t
        for nx in [x-1, x+1, x*2]:
            if 0 <= nx <= MAX and not v[nx]:
                v[nx] = 1
                q.append((nx,t+1))

N, K = map(int, input().split())
print(bfs(N, K))


