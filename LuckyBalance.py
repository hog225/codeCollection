#!/bin/python3
# 그리디 알고리즘
import math
import os
import random
import re
import sys

# Complete the luckBalance function below.
def luckBalance(k, contests):

    luck = 0
    impList = []
    for v in contests:
        l = v[0]
        t = v[1]
        if t == 0:
            luck += l
        else:
            impList.append(l)

    impList.sort()

    testcnt = len(impList)
    wincnt = testcnt - k

    minusLuck = 0
    for i in range(wincnt):
        minusLuck += impList[i]
        impList[i] = 0

    list_luck = sum(impList)


    return luck + list_luck - minusLuck




if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    contests = []

    for _ in range(n):
        contests.append(list(map(int, input().rstrip().split())))

    result = luckBalance(k, contests)
    print(result)
    # fptr.write(str(result) + '\n')
    #
    # fptr.close()
