/*
Problem     : Rising Temperature
Difficulty  : Easy
URL         : https://leetcode.com/problems/rising-temperature/
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
Runtime: 657 ms, faster than 13.73% of MySQL online submissions for Rising Temperature.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Rising Temperature.
*/