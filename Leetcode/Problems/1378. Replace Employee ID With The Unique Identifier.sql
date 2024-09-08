/*
Problem     : Replace Employee ID With The Unique Identifier
Difficulty  : Easy
URL         : https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description
*/

SELECT unique_id, name
FROM Employees
LEFT JOIN EmployeeUNI
using (id);