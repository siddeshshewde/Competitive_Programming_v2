/*
Exercise : 3
User     : Serge I
Date     : 2002-09-21
Link     : https://sql-ex.ru/learn_exercises.php?LN=3

Problem
Find the model number, RAM and screen size of the laptops with prices over $1000.

Help topic
Simple SELECT statement - http://www.sql-tutorial.ru/en/book_simple_select_statement/page1.html
*/

select model, ram, screen
from laptop
where price > 1000;