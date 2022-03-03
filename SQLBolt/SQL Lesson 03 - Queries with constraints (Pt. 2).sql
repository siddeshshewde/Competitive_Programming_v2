/*
Name: SQL Lesson 3: Queries with constraints (Pt. 2)
Link: https://sqlbolt.com/lesson/select_queries_with_constraints_pt_2
*/

1. Find all the Toy Story movies ✓
SELECT * FROM movies
WHERE title LIKE '%Toy Story%';

2. Find all the movies directed by John Lasseter ✓
SELECT * FROM movies
WHERE director = 'John Lasseter';

3. Find all the movies (and director) not directed by John Lasseter ✓
SELECT * FROM movies
WHERE director != 'John Lasseter';

4. Find all the WALL-* movies ✓
SELECT * FROM movies
WHERE title LIKE 'WALL-%';