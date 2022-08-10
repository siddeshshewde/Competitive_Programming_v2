/*
Name: SQL: Right and Left
Link: https://www.codewars.com/kata/5943a58f95d5f72cb900006a/train/sql
Difficulty: 7 Kyu
*/

SELECT LEFT(project, commits) as project, RIGHT(address, contributors) as address
FROM repositories;