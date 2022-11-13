'''
Series      : Simple Fun 
Problem     : #2: Circle of Numbers
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/58841cb52a077503c4000015/train/python
'''

def circle_of_numbers(n, first):
    number = n / 2
    if number > first:
        return n/2 + first
    elif number < first:
        return first - number
    else:
        return 0