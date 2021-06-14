
M = int(input())

T = []
for i in range(M):
    t = [int(j) for j in input().split(' ')]
    T.append(t)

Half = int(M/2)
S_LIST = [0 for i in range(Half)]
checked = -1
check = [0 for i in range(M)]

MIN = []

def sol(idx, M, Half):
    global checked
    if idx == Half:
        t1 = set(S_LIST)
        t2 = set(range(M)) - t1

        p_t1 = 0
        for i in t1:
            for j in t1:
                if not i == j:
                    p_t1 += T[i][j]
        p_t2 = 0
        for i in t2:
            for j in t2:
                if not i == j:
                    p_t2 += T[i][j]

        k = abs(p_t1 - p_t2)
        MIN.append(k)

    else:
        for i in range(0, M):
            if check[i] == False:
                if i > checked:
                    S_LIST[idx] = i
                    check[i] = True
                    sol(idx+1, M, Half)
                    check[i] = False
                    checked = i


sol(0, M, Half)
MIN.sort()
print(MIN[0])