'''
Problem     : V A P O R C O D E
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5966eeb31b229e44eb00007a/train/python
'''

def vaporcode(s):
    result = ''
    for i in s.replace(' ', '').upper():
        result += i + '  '
    return result[:-2]