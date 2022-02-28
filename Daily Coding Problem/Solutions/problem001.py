"""
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
"""

def check_sum(arr, target):
    potential_solutions = []
    
    for num in arr:
        if num in potential_solutions:
            return True
        
        potential_solutions.append(target-num)
        
    return False
    
    
print (check_sum([10, 15, 3, 7], 19)) == False
print (check_sum([10, 15, 3, 4], 17)) == False
print (check_sum([], 17))             == False
print (check_sum([10, 15, 3, 7],17))  == True

"""
SPECS:
TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
"""
