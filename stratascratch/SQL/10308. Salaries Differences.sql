/*
ID:         10308
Problem:    Salaries Differences
Difficulty: Easy
Company:    Dropbox
URL:        https://platform.stratascratch.com/coding/10308-salaries-differences
*/

SELECT 
(
SELECT max(salary)
FROM db_employee
WHERE department_id in (SELECT id FROM db_dept WHERE department in ('marketing'))
)
-
(
SELECT max(salary)
FROM db_employee
WHERE department_id in (SELECT id FROM db_dept WHERE department in ('engineering'))
) as sal_diff