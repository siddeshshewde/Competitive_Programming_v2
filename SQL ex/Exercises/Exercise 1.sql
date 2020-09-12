/*
Exercise : 1
User     : Serge I
Date     : 2002-09-30
Link     : https://sql-ex.ru/learn_exercises.php?LN=1

Problem
Find the model number, speed and hard drive capacity for all the PCs with prices below $500.
Result set: model, speed, hd.

Help Topics
Simple Select Statement - http://www.sql-tutorial.ru/en/book_simple_select_statement/page1.html

*/

select a.model, b.speed, b.hd
from product a
left join pc b
on a.model = b.model
where price < 500