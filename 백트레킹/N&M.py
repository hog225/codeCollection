N, M = [int(i) for i in input().split()]


solList = [0 for i in range(M)]
check = [0 for i in range(0, N+1)]


def allCase(idx, N, M):

    if idx == M:
        for i in solList:
            print(i, end=' ')
        print()
        return


    for num in range(1, N+1):
        if check[num] == False:
            solList[idx] = num
            check[num] = True
            allCase(idx+1, N, M)
            check[num] = False


allCase(0, N, M)


