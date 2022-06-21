/*
Problem     : Big Countries
Difficulty  : Easy
URL         : https://leetcode.com/problems/big-countries/
*/

SELECT name, population, area
FROM world
WHERE area >= 3000000 or population >= 25000000;

/*
Runtime: 318 ms, faster than 47.52% of MySQL online submissions for Big Countries.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Big Countries.
*/