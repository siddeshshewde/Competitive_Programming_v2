"""
https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/python

Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105
Zero alone is fine, don't worry about it. Poor guy anyway

"""

def no_boring_zeros(n):
    if n == 0:
        return 0

    while n % 10 == 0:
        n /= 10
    return n