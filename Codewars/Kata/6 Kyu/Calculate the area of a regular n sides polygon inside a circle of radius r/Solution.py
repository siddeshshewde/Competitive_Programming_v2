#https://www.codewars.com/kata/calculate-the-area-of-a-regular-n-sides-polygon-inside-a-circle-of-radius-r/train/python

# Calculate the area of a regular n sides polygon inside a circle of radius r

#Write the following function:

#def area_of_polygon_inside_circle(circle_radius, number_of_sides):
#It should calculate the area of a regular polygon of numberOfSides, number-of-sides, or number_of_sides sides inside a circle of radius circleRadius, circle-radius, or circle_radius which #passes through all the vertices of the polygon (such circle is called circumscribed circle or circumcircle). The answer should be a number rounded to 3 decimal places.

#Input :: Output Examples

#area_of_polygon_inside_circle(3, 3) # returns 11.691

#area_of_polygon_inside_circle(5.8, 7) # returns 92.053

#area_of_polygon_inside_circle(4, 5) # returns 38.042


import math
def area_of_polygon_inside_circle(r, n):
    return round(r * r * n * math.sin(math.pi/n * 2)/2,3)