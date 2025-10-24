import sys

# 입력 속도 향상을 위해 전체 입력을 한 번에 받아서 공백 기준으로 나눕니다.
data = sys.stdin.read().split()

# 첫 번째 값: N(숫자의 개수), 두 번째 값: M(질의 개수)
n = int(data[0])
m = int(data[1])

# 누적합 배열 S 초기화 (인덱스를 1부터 쓰기 위해 크기를 N+1로 설정)
# S[i] = 1번부터 i번까지의 수의 합
s = [0] * (n + 1)

sum = 0
# 원본 수열은 data[2]부터 시작해서 N개의 숫자가 들어있음
for i in range(n):
    # 현재 숫자를 더하면서 누적합 갱신
    sum += int(data[i + 2])
    s[i + 1] = sum  # i+1번째 위치에 저장 (S[1] ~ S[N])

results = []

# M개의 구간 합 쿼리(a, b)를 처리
# 쿼리는 data[2 + N]부터 시작하며, (a, b) 쌍으로 주어짐
for k in range(m):
    a = int(data[2 + n + 2 * k])      # 시작 인덱스
    b = int(data[2 + n + 2 * k + 1])  # 끝 인덱스

    # 누적합을 이용해 구간 합을 빠르게 계산
    # 구간 [a, b]의 합 = S[b] - S[a-1]
    cnt = s[b] - s[a - 1]

    results.append(str(cnt))

# 결과를 한 번에 출력 (출력 속도 최적화를 위해 join + sys.stdout.write 사용)
sys.stdout.write('\n'.join(results) + '\n')