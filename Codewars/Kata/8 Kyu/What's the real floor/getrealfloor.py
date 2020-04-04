"""
Title:
	What's the real floor?

Kata:
	https://www.codewars.com/kata/574b3b1599d8f897470018f6/train/python

Description:
	Americans are odd people: in their buildings, the first floor is actually the ground floor and there is no 13th floor ('cause of superstition).

Task:
	Write a function that given an American floor (passed as an integer) returns the real floor.
	Moreover, your function should work for basement floors too: just return the same value as the passed one.

Example:
	getRealFloor(1) == 0 
	getRealFloor(0) == 0 // Special case to please Europeans
	getRealFloor(5) == 4
	getRealFloor(15) == 13
	getRealFloor(-3) == -3

"""

def get_real_floor(n):
    if(n < 1):
        return n;
    if(n < 13):
        return n-1;
    if(n > 12):
        return n-2;