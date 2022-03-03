/*
Name: SQL Lesson 6: Multi-table queries with JOINs
Link: https://sqlbolt.com/lesson/select_queries_with_joins
*/

1. Find the domestic and international sales for each movie ✓
SELECT a.title, b.domestic_sales, b.international_sales
FROM movies a
LEFT JOIN boxoffice b
on a.id = b.movie_id;

2. Show the sales numbers for each movie that did better internationally rather than domestically ✓
SELECT a.title, b.domestic_sales, b.international_sales
FROM movies a
LEFT JOIN boxoffice b
on a.id = b.movie_id
WHERE b.international_sales > b.domestic_sales;

3. List all the movies by their ratings in descending order ✓
SELECT title, rating
FROM movies a
JOIN boxoffice b
on a.id = b.movie_id
ORDER BY b.rating DESC;