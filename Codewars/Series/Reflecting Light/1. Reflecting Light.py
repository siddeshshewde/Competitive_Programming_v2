'''
Problem     : Reflecting Light
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5eaf88f92b679f001423cc66/train/python
'''

from math import gcd

def reflections(x,y):
    g=gcd(x,y)
    return (x//g+y//g)%2 == 0