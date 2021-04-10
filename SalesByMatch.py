#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sockMerchant function below.
# test
# 7
# 1 2 1 2 1 3 2
#
# 9
# 10 20 20 10 10 30 50 10 20

# 배열에서 2개씩 짝을 찾는 문제 해커랭크

def sockMerchant(n, ar):
    resultMap = {}
    for i in ar:
        try:
            list(resultMap.keys()).index(i)
            resultMap[i] += 1
        except:
            resultMap[i] = 1
    count = 0
    for i in resultMap.keys():
        res = int(resultMap[i] / 2)
        count += res

    return count




if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    print(result)
