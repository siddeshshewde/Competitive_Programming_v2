/*
Exercise : 2
User     : Serge I
Date     : 2002-09-21
Link     : https://sql-ex.ru/learn_exercises.php?LN=2

Problem
List all printer makers. Result set: maker.

Help Topics
Simple Select Statement - http://www.sql-tutorial.ru/en/book_simple_select_statement/page1.html

*/

select distinct maker
from product where type = 'printer'