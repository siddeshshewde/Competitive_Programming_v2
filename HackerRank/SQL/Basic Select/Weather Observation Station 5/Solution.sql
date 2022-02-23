/*
Problem     : Weather Observation Station 5
Difficulty  : Easy
Max Score   : 30
URL         : https://www.hackerrank.com/challenges/weather-observation-station-5/problem
*/

SELECT CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY), CITY
LIMIT 1;

SELECT CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY) DESC, CITY
LIMIT 1;
