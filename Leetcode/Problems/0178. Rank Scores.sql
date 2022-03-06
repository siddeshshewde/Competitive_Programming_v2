/*
Problem     : Rank Scores
Difficulty  : Medium
URL         : https://leetcode.com/problems/rank-scores/
*/


SELECT 
    score, 
    DENSE_RANK() OVER (ORDER BY Score DESC) AS Rank
FROM scores;

/*
Runtime: 1359 ms, faster than 47.42% of MS SQL Server online submissions for Rank Scores.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Rank Scores.
*/