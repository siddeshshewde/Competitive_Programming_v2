
#https://www.codewars.com/kata/area-of-a-circle/train/python
# Area of a Circle


#Complete the function circleArea so that it will return the area of a circle with the given radius. 
#Round the returned number to two decimal places (except for Haskell). If the radius is not positive or not a number, return false.

#Example:

#circleArea(-1485.86)     #returns false
#circleArea(0)            #returns false
#circleArea(43.2673)      #returns 5881.25
#circleArea(68)           #returns 14526.72
#circleArea("number")     #returns false



import math
def circleArea(r):
    try:
        #if type(r) != int : return False
        return round(math.pi*r*r,2) if r > 0 and type(r) == int else False
    except:
        return False