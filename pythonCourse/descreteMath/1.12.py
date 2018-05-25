#!/usr/bin/python
# -*- coding: utf-8 -*-

if __name__ == '__main__':
    n = int(input('Enter n:'))
    (elements, item, toForward) = ([], [], [])
    elements[:] = [i for i in range(n + 1)]
    item[:] = [1 for i in range(n + 1)]
    toForward[:] = [True for i in range(n + 1)]

    item[n] = 0

    for i in range(1, n+1):
        print elements[i],
    print

    i = 1

    while i < n:
        i = 1
        x = 0
        while item[i] == n - i + 1:
            toForward[i] = not toForward[i]
            item[i] = 1
            if toForward[i]:
                x += 1
            i += 1
        if i < n:
            if toForward[i]:
                k = item[i] + x
            else:
                k = n - i + 1 - item[i] + x
            y = elements[k]
            elements[k] = elements[k + 1]
            elements[k + 1] = y

            for l in range(1, n+1):
                print elements[l],
            print
            
            item[i] += 1
