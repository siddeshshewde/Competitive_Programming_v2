/*
Problem     : Combine Two Tables
Difficulty  : Easy
URL         : https://leetcode.com/problems/combine-two-tables/
*/

SELECT firstname, lastname, city, state
FROM person a
LEFT JOIN address b
ON a.personId = b.personId;

/*
Runtime: 371 ms, faster than 61.23% of MySQL online submissions for Combine Two Tables.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Combine Two Tables.
*/