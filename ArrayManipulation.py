#!/bin/python3

import math
import os
import random
import re
import sys
import numpy as np


# Complete the arrayManipulation function below.
#
# 5 3
# 1 2 100
# 2 5 100
# 3 4 100
# 배열 누적합 관련 문제

def arrayManipulation(n, queries):

    resultArr = [0 for i in range(n+1)]


    for q in queries:
        start = q[0]
        end = q[1]
        v = q[2]

        resultArr[start-1] += v
        resultArr[end] += -1*v
    tmp = 0
    maxVal = -1
    for i in resultArr:
        tmp += i
        if maxVal <tmp:
            maxVal = tmp

    return maxVal


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)
    print(result)
    # fptr.write(str(result) + '\n')
    #
    # fptr.close()
