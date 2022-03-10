/*
Problem     : Delete Duplicate Emails
Difficulty  : Easy
URL         : https://leetcode.com/problems/delete-duplicate-emails/
*/

DELETE FROM person
WHERE id NOT in (
    SELECT id FROM (SELECT MIN(id) as id
    FROM person
    GROUP BY email) a
)

/*
Runtime: 700 ms, faster than 67.89% of MySQL online submissions for Delete Duplicate Emails.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Delete Duplicate Emails.
*/