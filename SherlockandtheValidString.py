#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isValid function below.
def isValid(s):
    alpd = {}
    countd = {}
    countl = []
    for c in s:
        if not c in alpd:
            alpd[c] = 1
        else:
            alpd[c] += 1

    for c in alpd:
        if not alpd[c] in countd:
            countl.append(alpd[c])
            countd[alpd[c]] = [c]
        else:
            countd[alpd[c]].append(c)

    if len(countd) > 2:
        return 'NO'
    elif len(countd) == 1:
        return 'YES'
    else:

        if (countl[0] == 1 and len(countd[countl[0]]) ==  1):
            return 'YES'

        if (countl[1] == 1 and len(countd[countl[1]]) ==  1):
            return 'YES'

        a = len(countd[countl[0]]) # 3 a,c
        b = len(countd[countl[1]]) # 2 b
        if countl[0] - countl[1] == 1:
            if a == 1:
                return 'YES'
        elif countl[0] - countl[1] == -1:
            if b == 1:
                return 'YES'

        return 'NO'



if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = isValid(s)
    print(result)

    # fptr.write(result + '\n')
    #
    # fptr.close()

