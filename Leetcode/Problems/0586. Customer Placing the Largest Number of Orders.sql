/*
Problem     : Customer Placing the Largest Number of Orders
Difficulty  : Easy
URL         : https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/
*/

SELECT customer_number
FROM
(
    SELECT customer_number, count(*) as count
    FROM Orders
    GROUP BY customer_number
    ORDER BY count DESC
) as e
LIMIT 1

/*
Runtime: 530 ms, faster than 32.66% of MySQL online submissions for Customer Placing the Largest Number of Orders.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Customer Placing the Largest Number of Orders.
*/