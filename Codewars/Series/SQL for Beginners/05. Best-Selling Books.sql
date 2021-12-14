/*
Problem     : Best-Selling Books (SQL for Beginners #5)
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/591127cbe8b9fb05bd00004b/train/sql
*/

SELECT *
FROM books
ORDER BY copies_sold desc
LIMIT 5;