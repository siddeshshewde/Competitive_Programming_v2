/*
Name: SQL Lesson 9: Queries with expressions
Link: https://sqlbolt.com/lesson/select_queries_with_expressions
*/

1. List all movies and their combined sales in millions of dollars ✓
SELECT a.title, sum(b.domestic_sales + b.international_sales)/1000000 as sales
FROM movies a
LEFT JOIN boxoffice b
ON a.id = b.movie_id
GROUP BY a.title;

2. List all movies and their ratings in percent ✓
SELECT a.title, b.rating * 10 as rating
FROM movies a
LEFT JOIN boxoffice b
ON a.id = b.movie_id;

3. List all movies that were released on even number years ✓
SELECT title
FROM movies
WHERE year % 2 = 0;