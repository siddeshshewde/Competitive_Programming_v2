'''
Problem     : Removing Elements
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/python
'''
def remove_every_other(my_list):
    i = len(my_list) - 1
    while(True):
        if i == 0:
            break
        if i % 2 != 0:
            del(my_list[i])
        i = i - 1
    return my_list
            
