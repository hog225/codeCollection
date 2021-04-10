#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the repeatedString function below.
def repeatedString(s, n):
    count = len(s)

    p = int(n/count)
    remainder = (n%count)

    if p == 0:
        print('f')
        ncount = s[0:n].count('a')
        return ncount
    else:
        acount = s.count('a')*p
        racount = s[0:remainder].count('a')
        return acount+racount

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)
    print(result)
    # fptr.write(str(result) + '\n')
    #
    # fptr.close()
