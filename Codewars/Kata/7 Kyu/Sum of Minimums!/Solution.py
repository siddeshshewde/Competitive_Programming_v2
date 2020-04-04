"""
https://www.codewars.com/kata/5d5ee4c35162d9001af7d699/train/python

Given a 2D list of size m * n. Your task is to find the sum of minimum value in each row.

For Example:

[
  [1, 2, 3, 4, 5],       # minimum value of row is 1
  [5, 6, 7, 8, 9],       # minimum value of row is 5
  [20, 21, 34, 56, 100]  # minimum value of row is 20
]
So, the function should return 26 because sum of minimums is as 1 + 5 + 20 = 26

Note: You will be always given non-empty list containing Positive values.

ENJOY CODING :)
"""

def sum_of_minimums(numbers):
    
    sum = 0
    
    for i in range(0, len(numbers)):
        numbers[i].sort()
        sum += numbers[i][0]
        
    return sum