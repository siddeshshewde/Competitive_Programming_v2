/*
Problem     : Weather Observation Station 3
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/weather-observation-station-3/problem
*/

SELECT DISTINCT CITY
FROM STATION
WHERE MOD(ID, 2) = 0;