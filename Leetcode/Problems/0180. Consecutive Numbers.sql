/*
Problem     : Consecutive Numbers
Difficulty  : Medium
URL         : https://leetcode.com/problems/consecutive-numbers/
*/

SELECT DISTINCT l1.Num  as ConsecutiveNums
FROM Logs l1, Logs l2, Logs l3  
WHERE l1.Id + 1 = l2.Id AND l2.Id + 1 = l3.Id AND l1.Num = l2.Num AND l2.Num = l3.Num

/*
Runtime: 509 ms, faster than 48.89% of MySQL online submissions for Consecutive Numbers.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Consecutive Numbers.
*/