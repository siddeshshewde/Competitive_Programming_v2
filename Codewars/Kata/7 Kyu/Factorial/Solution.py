'''
Problem     : Factorial
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc/train/python
'''

def factorial(n):
    if n < 0 or n > 12:
        raise ValueError
    
    fact = 1
    
    for i in range (1, n+1):
        fact *= i
    
    return fact