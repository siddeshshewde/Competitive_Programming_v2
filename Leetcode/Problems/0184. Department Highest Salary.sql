/*
Problem     : Department Highest Salary
Difficulty  : Medium
URL         : https://leetcode.com/problems/department-highest-salary/
*/

select d.name as Department, e.name as Employee, salary as Salary 
FROM
(SELECT departmentID, name, salary, dense_rank() OVER(Partition By departmentId order by salary DESC) as rrank
FROM Employee) as e
LEFT JOIN Department d
on e.departmentId = d.id
Where rrank = 1;

/*
Runtime: 551 ms, faster than 74.01% of MySQL online submissions for Department Highest Salary.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Department Highest Salary.
*/