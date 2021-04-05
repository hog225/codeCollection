N, M = [int(i) for i in input().split()]


solList = [0 for i in range(M)]
check = [0 for i in range(0, N+1)]
ansSet = set()

def allCase(idx, N, M):

    if idx == M:

        ans_str = ''

        tmpList = solList[:]
        tmpList.sort()

        for i in tmpList:
            ans_str += str(i) + ' '

        ansSet.add(ans_str)
        return


    for num in range(1, N+1):
        if check[num] == False:
            solList[idx] = num
            check[num] = True
            allCase(idx+1, N, M)
            check[num] = False


allCase(0, N, M)
ansList = list(ansSet)
ansList.sort()
for i in ansList:
    print (i)

