/*
Name: SQL Basics: Repeat and Reverse
Link: https://www.codewars.com/kata/59414360f5c3947364000070/train/sql
Difficulty: 7 Kyu
*/

SELECT CONCAT(name, name, name) as name, REVERSE(characteristics) as characteristics
FROM monsters;