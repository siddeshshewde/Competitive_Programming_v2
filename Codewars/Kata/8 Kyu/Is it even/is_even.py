"""
Title:
	Is it even?

Kata:
	https://www.codewars.com/kata/555a67db74814aa4ee0001b5/train/python

Description:
	In this Kata we are passing a number (n) into a function.

	Your code will determine if the number passed is even (or not).

	The function needs to return either a true or false.

	Numbers may be positive or negative, integers or floats.

	Floats are considered UNeven for this kata.

"""

def is_even(n): 
    if n/2 == int(n/2) and n%2 == 0:
        return True
    return False