/*
Problem     : Second Highest Salary
Difficulty  : Medium
URL         : https://leetcode.com/problems/second-highest-salary
*/


SELECT MAX(Salary) AS SecondHighestSalary 
FROM Employee
WHERE Salary not in(select max(Salary) from Employee)

/*
Runtime: 281 ms, faster than 22.37% of MySQL online submissions for Second Highest Salary.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Second Highest Salary.
*/