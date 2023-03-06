#!/bin/python3
N = int(input())


def printFlag_weird(N):
    if (N % 2) == 0:
        flag = 'Not Weird'
    else:
        flag = 'Weird'

    if (N % 2) == 0 and N > 20:
        flag = 'Not Weird'

    if N in range(6, 22, 2):
        flag = 'Weird'

    return flag


flag = printFlag_weird(N)
print(flag)
