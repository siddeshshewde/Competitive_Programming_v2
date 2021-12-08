/*
Exercise : 5
User     : Serge I
Date     : 2002-09-30
Link     : https://sql-ex.ru/learn_exercises.php?LN=5
Problem
Find the model number, speed and hard drive capacity of PCs cheaper than $600 having a 12x or a 24x CD drive.
Help topic
Simple SELECT statement - http://www.sql-tutorial.ru/en/book_simple_select_statement/page1.html
*/

SELECT model, speed, hd
FROM PC
WHERE price < 600 and cd in ('12x', '24x');