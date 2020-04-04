"""
https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/python

Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.

Your task is to make 'Past' function which returns time converted to milliseconds.

Example:
past(0, 1, 1) == 61000
Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59

"""
def past(h, m, s):
    return h*3600000+m*60000+s*1000