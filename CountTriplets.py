#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countTriplets function below.
# def countTriplets(arr, r):
#     darr = {}
#
#     for v in arr:
#         if not v in darr.keys():
#             darr[v] = 1
#
#         else:
#             darr[v] += 1
#
#     count = 0
#     for v in arr:
#         tmpdarr = darr.copy()
#         i = v
#         j = v * r
#         k = v * r * r
#
#
#         j_c=0
#         k_c=0
#         if i in tmpdarr.keys():
#             tmpdarr[i] -= 1
#             if tmpdarr[i] <= 0:
#                 tmpdarr.pop(i)
#
#             darr[i] -= 1
#             if darr[i] <= 0:
#                 darr.pop(i)
#
#         if j in tmpdarr.keys():
#             j_c = tmpdarr[j]
#             tmpdarr[j] -= 1
#             if tmpdarr[j] <= 0:
#                 tmpdarr.pop(j)
#
#         if k in tmpdarr.keys():
#             k_c = tmpdarr[k]
#             tmpdarr[k] -= 1
#             if tmpdarr[k] <= 0:
#                 tmpdarr.pop(k)
#
#         count += 1 * j_c * k_c
#
#
#     return count


def countTriplets(arr, r):
    m2 = {}
    m3 = {}

    total = 0
    for val in arr:

        if val in m3:
            total += m3[val]
        # 1 2 2 4
        if val in m2:

            if val * r in m3.keys():
                m3[val * r] += m2[val]
            else:
                m3[val * r] = m2[val]


        if val * r in m2.keys():
            m2[val * r] += 1
        else:
            m2[val * r] = 1

    return total

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nr = input().rstrip().split()

    n = int(nr[0])

    r = int(nr[1])

    arr = list(map(int, input().rstrip().split()))

    ans = countTriplets(arr, r)
    print(ans)
    #
    # fptr.write(str(ans) + '\n')
    #
    # fptr.close()
