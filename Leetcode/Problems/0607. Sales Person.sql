/*
Problem     : Sales Person
Difficulty  : Easy
URL         : https://leetcode.com/problems/sales-person/
*/

SELECT distinct s.name
FROM SalesPerson as s
LEFT JOIN Orders as o
ON s.sales_id = o.sales_id
WHERE s.sales_id not in (
    SELECT sales_id 
    FROM Orders 
    WHERE com_id = (
        SELECT com_id 
        FROM Company 
        WHERE name = 'RED'
        )
    )

/*
Runtime: 2124 ms, faster than 14.79% of MySQL online submissions for Sales Person.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Sales Person.
*/