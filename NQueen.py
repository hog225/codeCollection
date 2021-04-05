N = int(input())
# N 개의 퀸 시간 초과함
count = 0
def isPromising(q, n):
    for i in range(n):
        if q[i] == q[n]:
            return False
        if (q[i] - q[n]) == (n - i):
            return False
        if (q[n] - q[i]) == (n - i):
            return False

    return True

def enum1(N):
    a = [0 for i in range(N)]
    enum2(a, 0, N)

def enum2(q, n, N):
    global count
    if n == N:
        count += 1
    else:
        for i in range(N):
            q[n] = i


            if isPromising(q, n):
                enum2(q, n+1, N)


enum1(N)
print(count)

