/*
Problem     : Number of countries visited
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/66c71c893759d440748154f8/train/sql
*/

SELECT p.name as name, count(distinct v.country_id) as countries_visited
FROM visits as v
RIGHT JOIN people as p
ON v.person_id = p.id
GROUP BY 1
ORDER BY 2 DESC, 1 