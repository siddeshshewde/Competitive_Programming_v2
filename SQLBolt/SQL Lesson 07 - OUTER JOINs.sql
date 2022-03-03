/*
Name: SQL Lesson 7: OUTER JOINs
Link: https://sqlbolt.com/lesson/select_queries_with_outer_joins
*/

1. Find the list of all buildings that have employees ✓
SELECT distinct building
FROM employees;

2. Find the list of all buildings and their capacity ✓
SELECT building_name, capacity
FROM buildings;

3. List all buildings and the distinct employee roles in each building (including empty buildings) ✓
SELECT DISTINCT building_name, role 
FROM buildings 
LEFT JOIN employees
ON building_name = building;