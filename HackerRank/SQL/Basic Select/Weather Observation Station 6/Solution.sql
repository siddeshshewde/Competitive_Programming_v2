/*
Problem     : Weather Observation Station 6
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/weather-observation-station-6/problem
*/

SELECT DISTINCT CITY FROM STATION
WHERE
CITY LIKE 'A%' OR
CITY LIKE 'E%' OR
CITY LIKE 'I%' OR
CITY LIKE 'O%' OR
CITY LIKE 'U%'
ORDER BY CITY;