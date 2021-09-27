'''
Problem     : Without the letter 'E'
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/594b8e182fa0a0d7fc000875/train/python
'''

def find_e(s):
    if s == '':
        return ''
    if s is None:
        return None
    n = s.count('e') + s.count('E')
    if n == 0: 
        return 'There is no "e".'
    else:
        return str(n)