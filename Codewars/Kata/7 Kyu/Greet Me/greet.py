"""
Title:
    Greet Me

Kata:
    https://www.codewars.com/kata/535474308bb336c9980006f2/train/python

Description:
    Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

Example:
	"riley" --> "Hello Riley!"
	"JACK"  --> "Hello Jack!"

"""

def greet(name): 
   	#name = name.lower().capitalize()
    return ("Hello " + name .lower().capitalize() + "!")