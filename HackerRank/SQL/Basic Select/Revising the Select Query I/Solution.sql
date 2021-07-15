/*
Problem     : Revising the Select Query I
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/revising-the-select-query/problem
*/

SELECT *
FROM CITY
WHERE 
    COUNTRYCODE = "USA" and 
    POPULATION > 100000;