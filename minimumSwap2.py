
import math
import os
import random
import re
import sys
#
# Complete the minimumSwaps function below.
# def minimumSwaps(arr):
#     count = 0
#     for i, v in enumerate(arr):
#         if v != i+1:
#             arr.
#             for j in range(i+1, len(arr)):
#                 if i+1 == arr[j]:
#                     tmp = arr[i]
#                     arr[i] = arr[j]
#                     arr[j] = tmp
#                     count += 1
#                     break
#     return count

def minimumSwaps(arr):
    ard = {}
    for i, v in enumerate(arr):
        ard[v] = i+1
    count = 0
    for i in range(len(arr)):
        v = arr[i]
        if v != i + 1:
            tmp = ard[v]
            ard[v] = ard[tmp]
            ard[tmp] = tmp

            tmp = arr[ard[v]-1]
            arr[ard[v]-1] = arr[ard[tmp]-1]
            arr[ard[tmp]-1] = tmp
            count += 1




    return count

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = minimumSwaps(arr)
    print(res)
    #
    # fptr.write(str(res) + '\n')
    #
    # fptr.close()
