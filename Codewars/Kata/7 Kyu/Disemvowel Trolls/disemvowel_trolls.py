'''
Problem     : Disemvowel Trolls
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/52fba66badcd10859f00097e/train/python
'''

def disemvowel(string):
    v = ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    for i in string:
        if i in v:
            string = string.replace(i,'')
    return string