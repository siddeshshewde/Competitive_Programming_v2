/*
Name: SQL Lesson 12: Order of execution of a Query
Link: https://sqlbolt.com/lesson/select_queries_order_of_execution
*/

1. Find the number of movies each director has directed ✓
SELECT director, count(*) 
FROM movies
GROUP BY director;

2. Find the total domestic and international sales that can be attributed to each director ✓
SELECT director, sum(domestic_sales + international_sales) as sales 
FROM movies a
LEFT JOIN boxoffice b
on a.id = b.movie_id
GROUP BY director;