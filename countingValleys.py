#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countingValleys' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER steps
#  2. STRING path
#

#test
# 12
#DDUUDDUDUUUD
# 해안선에서 낮아졌다 한스텝 올라갈때를 밸리라고 하는데 밸리가 몇개 나오는지
# 해커랭크 

def countingValleys(steps, path):
    # Write your code here
    valleyStart = 0
    valley = 0

    height = 0
    for i, v in enumerate(path):


        if v == "D":
            height -= 1
            if height == -1:
                valleyStart = 1

        elif v == "U":
            height += 1
            if height == 0 and valleyStart == 1:
                valleyStart = 0
                valley += 1




    return valley

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    steps = int(input().strip())

    path = input()

    result = countingValleys(steps, path)
    print(result)
    # fptr.write(str(result) + '\n')
    #
    # fptr.close()
