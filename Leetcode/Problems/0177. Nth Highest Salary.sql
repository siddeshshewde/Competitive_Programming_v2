/*
Problem     : Nth Highest Salary
Difficulty  : Medium
URL         : https://leetcode.com/problems/nth-highest-salary
*/


CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M int;
SET M = N - 1;
  RETURN (
      SELECT IFNULL(
        (SELECT distinct salary
        FROM employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET M), NULL) as Salary
  );
END

/*
Runtime: 277 ms, faster than 94.95% of MySQL online submissions for Nth Highest Salary.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Nth Highest Salary.
*/