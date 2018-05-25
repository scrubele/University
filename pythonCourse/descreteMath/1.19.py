#!/usr/bin/python
# -*- coding: utf-8 -*-

if __name__ == '__main__':
    n = int(input('Enter n:'))
    (block, forward, next, prev) = ([], [], [], [])
    block[:] = [1 for i in range(n + 2)]
    forward[:] = [True for i in range(n + 2)]
    next[:] = [0 for i in range(n + 2)]
    prev[:] = [0 for i in range(n + 2)]

    for i in range(1, n + 1):
        print '(', i , ')',
    print

    max = 0
    j = n
    while j > 1:
        k = block[j]
        if forward[j]:
            if next[k] == 0:
                next[k] = j
                prev[j] = k
                next[j] = 0
            if next[k] > j:
                prev[j] = k
                next[j] = next[k]
                prev[next[j]] = j
                next[k] = j
            block[j] = next[k]
        else:
            block[j] = prev[k]
            if k == j:
                if next[k] == 0:
                    next[prev[k]] = 0
                else:
                    next[prev[k]] = next[k]

        if j > max:
            max = j

        j = n
        while j > 1 and forward[j] and block[j] == j or not forward[j]  and block[j] == 1:
            forward[j] = not forward[j]
            j -= 1

        flag = False
        for i in range(1, n + 1):
            flag = False
            kk = 0
            for k in range(1, n + 1):
                if block[k] == i:
                    kk = k
            if kk > 0:
                print '(',
                for k in range(1, n + 1):
                    if block[k] == i:
                        print k,
                print ')',
        print
