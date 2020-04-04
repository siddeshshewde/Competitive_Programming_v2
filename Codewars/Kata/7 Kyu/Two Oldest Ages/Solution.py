"""
https://www.codewars.com/kata/511f11d355fe575d2c000001/train/python

The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age, oldest age].

The order of the numbers passed in could be any order. The array will always include at least 2 items.

For example:

two_oldest_ages([1, 3, 10, 0]) # should return [3, 10]

"""

def two_oldest_ages(ages):
    
    n = ages[0] if ages[0] > ages[1] else ages[1]
    m = ages[0] + ages[1] - n
    
    if len(ages) > 2:
        for i in range (2, len(ages)):
            
            if ages[i] > m and ages[i] > n:
                m = n
                n = ages[i]
            
            elif ages[i] > m:
                m = ages[i]
    
    return ([m,n])