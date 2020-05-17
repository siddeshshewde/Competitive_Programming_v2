"""
Title:
    Split and then add both sides of an array together.

Kata:
    https://www.codewars.com/kata/5946a0a64a2c5b596500019a/train/python

Description:
    You will receive an array as parameter that contains 1 or more integers and a number n.

    Here is a little visualization of the process:

    Step 1: Split the array in two:

    [1, 2, 5, 7, 2, 3, 5, 7, 8]
          /            \
    [1, 2, 5, 7]    [2, 3, 5, 7, 8]
    Step 2: Put the arrays on top of each other:

       [1, 2, 5, 7]
    [2, 3, 5, 7, 8]
    Step 3: Add them together:

    [2, 4, 7, 12, 15]
    Repeat the above steps n times or until there is only one number left, and then return the array.

Example:
    Input: arr=[4, 2, 5, 3, 2, 5, 7], n=2


    Round 1
    -------
    step 1: [4, 2, 5]  [3, 2, 5, 7]

    step 2:    [4, 2, 5]
            [3, 2, 5, 7]

    step 3: [3, 6, 7, 12]


    Round 2
    -------
    step 1: [3, 6]  [7, 12]

    step 2:  [3,  6]
             [7, 12]

    step 3: [10, 18]


    Result: [10, 18]

    list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
    list_squared(42, 250) --> [[42, 2500], [246, 84100]]
    
    The form of the examples may change according to the language, see Example Tests: for more details.

"""

def split_and_add(numbers, n):

    while len(numbers) != 1 and n >= 1:
        top    = numbers[:len(numbers)//2]
        bottom = numbers[len(numbers)//2:]

        if len(top) > len(bottom):
            bottom.insert(0,0)
        if len(bottom) > len(top):
            top.insert(0,0)
        
        numbers = list(top[i]+bottom[i] for i in range (0,len(top) if len(top) > len(bottom) else len(bottom)))
        n -= 1
    
    return (numbers)