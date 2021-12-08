/*
Exercise : 6
User     : Serge I
Date     : 2002-10-28
Link     : https://sql-ex.ru/learn_exercises.php?LN=6
Problem
For each maker producing laptops with a hard drive capacity of 10 Gb or higher, find the speed of such laptops. Result set: maker, speed.
Help topic
Simple SELECT statement - http://www.sql-tutorial.ru/en/book_simple_select_statement/page1.html
*/

SELECT DISTINCT a.maker, b.speed
FROM Product a 
LEFT JOIN Laptop b
ON a.model = b.model
WHERE b.hd >= 10
GROUP BY a.maker, b.speed;