'''
Problem     : Cat years, Dog years
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/python
'''

def human_years_cat_years_dog_years(human_years):
    cat_years = 0
    dog_years = 0
    if human_years > 0:
        cat_years += 15
        dog_years += 15
    
    if human_years > 1:
        cat_years += 9
        dog_years += 9
    
    if human_years > 2:
        cat_years += (human_years - 2) * 4
        dog_years += (human_years - 2) * 5
    
    return [human_years, cat_years, dog_years]