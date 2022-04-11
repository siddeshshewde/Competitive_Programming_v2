/*
Problem     : Department Top Three Salaries
Difficulty  : Hard
URL         : https://leetcode.com/problems/department-top-three-salaries/
*/

SELECT d.name as Department, e.name as Employee, salary as Salary
FROM
(
    SELECT name, salary, departmentId, DENSE_RANK() OVER(PARTITION BY departmentId ORDER BY salary DESC) as rrank
    FROM Employee
) as e
LEFT JOIN Department as d
on e.departmentId = d.id
WHERE rrank < 4;

/*
Runtime: 1302 ms, faster than 11.52% of MySQL online submissions for Department Top Three Salaries.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Department Top Three Salaries.
*/