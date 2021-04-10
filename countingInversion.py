#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countInversions function below.

def countFuc (arr, si, ei, rearr):
    if ei - si < 1:
        return 0

    mi = int((si + ei) /2)
    lc = countFuc(arr, si, mi, rearr)
    rc = countFuc(arr, mi+1, ei, rearr)
    mc = merge(arr, si, mi, ei, rearr)
    arr[si:ei+1] = rearr[si:ei+1]
    return lc + rc + mc

def merge (arr, si ,mi, ei, rearr):
    l = si
    r = mi+1
    count = 0
    for i in range(si, ei+1):
        if si <= mi and (r > ei or arr[l] <= arr[r]):

            rearr[i] = arr[l]
            l += 1
        else:
            rearr[i] = arr[r]
            r += 1
            count += (mi - l + 1)
            print('count ', count, l, r, si, mi, ei)

    if count < 0:
        return 0

    return count

def countInversions(arr):

    rearr = [0 for i in arr]
    return countFuc(arr, 0, len(arr) - 1, rearr)





if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        arr = list(map(int, input().rstrip().split()))

        result = countInversions(arr)
        print(result)
        #fptr.write(str(result) + '\n')

    #fptr.close()
