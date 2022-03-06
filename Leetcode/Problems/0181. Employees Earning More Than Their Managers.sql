/*
Problem     : Employees Earning More Than Their Managers
Difficulty  : Easy
URL         : https://leetcode.com/problems/employees-earning-more-than-their-managers/
*/

SELECT name as Employee
FROM employee a
WHERE a.salary > (SELECT salary from employee b WHERE b.id = a.managerId)


/*
Runtime: 1321 ms, faster than 54.51% of MS SQL Server online submissions for Employees Earning More Than Their Managers.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Employees Earning More Than Their Managers.
*/