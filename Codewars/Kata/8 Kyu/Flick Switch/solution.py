'''
Problem     : Flick Switch
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/64fbfe2618692c2018ebbddb/train/python
'''

def flick_switch(lst):
    i = True
    new_lst = []
    for item in lst:
        if item == "flick":
            if i == False:
                i = True
            else:
                i = False
        new_lst.append(i)
    
    return new_lst
        