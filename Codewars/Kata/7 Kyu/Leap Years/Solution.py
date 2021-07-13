'''
Problem     : Leap Years
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/526c7363236867513f0005ca/train/python
'''

def isLeapYear(year):
    if year%4 == 0:
        if year%100 == 0:
            if year%400 == 0:
                return True
            return False
        return True
    return False