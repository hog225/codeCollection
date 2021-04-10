#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumBribes function below.
# not working
# def minimumBribes(q):
#     count = 0
#     for idx, v in enumerate(q):
#         if v == idx +1:
#             continue
#         tmpCnt = 0
#         for idx2 in range(idx+1, len(q)):
#             print(q[idx2], end = '')
#             if v > q[idx2]:
#                 tmpCnt += 1;
#         print()
#         if tmpCnt > 2:
#             print("Too chaotic")
#             return
#         count +=tmpCnt
#
#     print(count)

def minimumBribes(q):
    count = 0
    for idx, v in enumerate(q):

        if v - (idx +1) > 2:
            print("Too chaotic")
            return
    idx= 0
    while idx != len(q):

        if q[idx] != idx + 1:
            target = idx + 1
            for j in range(idx+1, len(q)):
                if q[j] == target:
                    tmp = q[j]
                    q[j] = q[j-1]
                    q[j-1] = tmp

                    idx = idx -1

                    count += 1

                    break
        idx += 1
    print(count)


if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        n = int(input())

        q = list(map(int, input().rstrip().split()))
        minimumBribes(q)
