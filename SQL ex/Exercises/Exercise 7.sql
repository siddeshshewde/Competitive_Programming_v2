/*
Exercise : 7
User     : Serge I
Date     : 2002-11-02
Link     : https://sql-ex.ru/learn_exercises.php?LN=7
Problem
Get the models and prices for all commercially available products (of any type) produced by maker B.
Help topic
Simple UNION statement - http://www.sql-tutorial.ru/en/book_union.html
JOINS - http://www.sql-tutorial.ru/en/book_explicit_join_operations.html
*/

SELECT pr.model, pc.price 
FROM Product as pr
JOIN PC as pc
ON pc.model = pr.model
WHERE pr.maker = 'B'
UNION
SELECT pr.model, l.price 
FROM Product as pr
JOIN Laptop as l
ON l.model = pr.model
WHERE pr.maker = 'B'
UNION
SELECT pr.model, p.price 
FROM Product as pr
JOIN Printer as p
ON p.model = pr.model
WHERE pr.maker = 'B'