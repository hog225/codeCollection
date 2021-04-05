N, M = [int(i) for i in input().split()]


solList = [0 for i in range(M)]
check = 0


def allCase(idx, N, M):
    global check
    if idx == M:
        for i in solList:
            print(i, end=' ')
        print()
        return


    for num in range(1, N+1):
        if num > check:
            solList[idx] = num
            allCase(idx+1, N, M)
            check = num




allCase(0, N, M)


