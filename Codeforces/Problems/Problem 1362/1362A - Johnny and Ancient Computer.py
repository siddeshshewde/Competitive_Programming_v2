"""
Problem      : Johnny and Ancient Computer
Round        : 1362A
Link         : https://codeforces.com/problemset/problem/1362/A
Difficulty   : 800
Category     : implementation, *1000
Time Limit   : 1s
Memory Limit : 256mb
Language     : Python
Time Taken   : 62ms
Memory       : 100kb
"""

from decimal import Decimal

class Problem1362A:
    
    def solve(a, b):
        c = 0 
        if a == b:
            return 0

        if a > b:
            while a > b:
                if a % 8 == 0 and a / 8 >= b:
                    a = a/8
                    c+=1
                elif a % 4 == 0 and a / 4 >= b:
                    a = a/4
                    c+=1
                elif a % 2 == 0 and a / 2 >= b:
                    a = a/2
                    c+=1
                else:
                    break
        else:
            while a < b:
                if a * 8 <= b:
                    a = a*8
                    c+=1
                elif a * 4 <= b:
                    a = a*4
                    c+=1
                elif a * 2 <= b:
                    a = a*2
                    c+=1
                else:
                    break
        if a == b:
            return c
        return -1
        
    def main():
        t = int(input())
        
        for i in range(0, t):
            a = input()
            a = a.split(' ')
            print(Problem1362A.solve(Decimal(a[0]), Decimal(a[1])))

Problem1362A.main()