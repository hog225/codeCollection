

import math
import os
import random
import re
import sys

# Complete the checkMagazine function below.
def checkMagazine(magazine, note):
    mdict = {}
    ndict = {}



    for i, v in enumerate(magazine):
        if not v in mdict.keys():
            mdict[v] = [i]
        else:
            mdict[v].append(i)

    for v in note:
        if not v in mdict.keys():
            # print(v)
            print('No')
            return
        else:
            if len(mdict[v]) > 1:
                mdict[v].pop(0)
            else:
                mdict.pop(v)



    print('Yes')





if __name__ == '__main__':
    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    magazine = input().rstrip().split()

    note = input().rstrip().split()

    checkMagazine(magazine, note)
