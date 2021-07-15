/*
Problem     : Revising the Select Query II
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/revising-the-select-query-2/problem
*/

SELECT NAME
FROM CITY
WHERE 
    COUNTRYCODE = "USA" and 
    POPULATION > 120000;