'''
Problem     : Racing #1: Simplified Drag Race
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5a40f5b01f7f70ed7600001e/train/python
'''

def drag_race(length, anna, bob):
    
    annaTime = (length/anna.speed) + anna.reaction_time
    bobTime = (length/bob.speed) + bob.reaction_time
    
    if  annaTime > bobTime:
        return "Bob is the winner"
    
    if annaTime < bobTime:
        return "Anna is the winner"
    
    return "It's a draw"