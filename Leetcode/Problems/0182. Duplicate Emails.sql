/*
Problem     : Duplicate Emails
Difficulty  : Easy
URL         : https://leetcode.com/problems/duplicate-emails/
*/

SELECT email as Email
FROM Person 
GROUP BY email
HAVING count(*) > 1;

/*
Runtime: 392 ms, faster than 39.52% of MySQL online submissions for Duplicate Emails.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Duplicate Emails.
*/