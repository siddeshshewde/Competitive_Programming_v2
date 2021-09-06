'''
Problem     : Find the calculation type
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5aca48db188ab3558e0030fa/train/python
'''

def calc_type(a, b, res):
    if a / b == res:
        return "division"
    elif a * b == res:
        return "multiplication"
    elif a + b == res:
        return "addition"
    else:
        return "subtraction"