/*
Problem     : Find Customer Referee
Difficulty  : Easy
URL         : https://leetcode.com/problems/find-customer-referee/submissions/
*/

SELECT name
FROM Customer
WHERE referee_id != 2 or referee_id is NULL;

/*
Runtime: 414 ms, faster than 82.74% of MySQL online submissions for Find Customer Referee.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Find Customer Referee.
*/