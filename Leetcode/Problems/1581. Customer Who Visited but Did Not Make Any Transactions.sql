/*
Problem     : Customer Who Visited but Did Not Make Any Transactions
Difficulty  : Easy
URL         : https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/description
*/

SELECT customer_id, count(1) as count_no_trans
FROM visits
LEFT JOIN transactions
using (visit_id)
WHERE transactions.visit_id is NULL
GROUP BY 1;