'''
Problem     : The Feast of Many Beasts
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/5aa736a455f906981800360d/train/python
'''

def feast(beast, dish):
    if (beast[:1] == dish[:1]) and (beast[-1] == dish[-1]):
        return True
    else:
        return False