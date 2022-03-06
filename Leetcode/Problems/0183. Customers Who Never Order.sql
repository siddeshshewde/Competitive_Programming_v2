/*
Problem     : Customers Who Never Order
Difficulty  : Easy
URL         : https://leetcode.com/problems/customers-who-never-order/
*/

SELECT a.name as Customers
FROM Customers a
LEFT JOIN Orders b
ON a.id = b.customerid
WHERE b.customerId is null;


/*
Runtime: 793 ms, faster than 85.64% of MS SQL Server online submissions for Customers Who Never Order.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customers Who Never Order.
*/