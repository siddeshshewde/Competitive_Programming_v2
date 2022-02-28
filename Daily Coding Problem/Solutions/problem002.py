"""
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
"""

def productExceptSelf(arr):
    solution = []
    
    for i in range(0, len(arr)):
        product = 1
        for j in range(0, len(arr)):
            if i==j:
                continue
            product *= arr[j]
        
        solution.append(product)        
        
    return solution
    
    
print (productExceptSelf([1, 2, 3, 4, 5])) == [120, 60, 40, 30, 24]
print (productExceptSelf([3, 2, 1]))       == [2, 3, 6]
print (productExceptSelf([1]))             == [1]
print (productExceptSelf([10, 15, 3, 7]))  == [315, 210, 1050, 450]

"""
SPECS:
TIME COMPLEXITY: O(n^2)
SPACE COMPLEXITY: O(n)
"""
