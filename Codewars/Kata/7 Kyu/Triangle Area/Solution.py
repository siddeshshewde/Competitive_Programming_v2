'''
Problem     : Triangle area
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/59bd84b8a0640e7c49002398/train/python
'''

def t_area(t_str):
    n = t_str.split('\n')
    n = len(n) - 3
    return n*n/2