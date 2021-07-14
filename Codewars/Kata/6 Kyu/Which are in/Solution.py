'''
Problem     : Which are in?
Difficulty  : 6 Kyu
URL         : https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/python
'''

def in_array(array1, array2):
    r = []
    
    for i in array1:
        for j in array2:
            if i in j:
                r.append(i)
    r = list(set(r))
    r.sort()
    
    return r