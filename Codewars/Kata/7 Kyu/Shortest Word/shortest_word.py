'''
Problem     : Shortest Word
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/python
'''

def find_short(s):
    s = s.split()
    l = len(s[0])
    for i in s:
        if len(i) < l:
            l = len(i)
    return l


# Best Answer
def find_short(s):
    return min(len(x) for x in s.split())
