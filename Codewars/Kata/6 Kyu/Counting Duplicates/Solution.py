'''
Problem     : Counting Duplicates
Difficulty  : 6 Kyu
URL         : https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/python
'''

def duplicate_count(text):
    
    n = 0
    i = 0
    while len(text) > 0:
        count = 0
        for j in range(i+1, len(text)):
            if (text[i].lower() == text[j].lower()):
                count += 1
        if count > 0:
            n += 1
        text = (text.lower()).replace(text[i].lower(), "")
        print (text)
        
    return n