'''
Problem     : What is between?
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/python
'''

def between(a,b):
    n = []
    for i in range (a, b+1):
        n.append(i)
    
    return n