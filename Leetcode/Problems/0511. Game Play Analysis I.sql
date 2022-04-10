/*
Problem     : Game Play Analysis I
Difficulty  : EasyMedium
URL         : https://leetcode.com/problems/game-play-analysis-i/
*/

SELECT player_id, min(event_date) as first_login
FROM Activity
GROUP BY player_id

/*
Runtime: 601 ms, faster than 39.01% of MySQL online submissions for Game Play Analysis I.
Memory Usage: 0B, less than 100.00% of MySQL online submissions for Game Play Analysis I.
*/