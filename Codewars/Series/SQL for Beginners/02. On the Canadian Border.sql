/*
Problem     : On the Canadian Border (SQL for Beginners #2)
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/590ba881fe13cfdcc20001b4/train/sql
*/

SELECT name, country
FROM travelers
WHERE country not in ('USA', 'Canada', 'Mexico');