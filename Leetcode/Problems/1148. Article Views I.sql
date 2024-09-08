/*
Problem     : Article Views I
Difficulty  : Easy
URL         : https://leetcode.com/problems/article-views-i/description/
*/

SELECT distinct author_id as id
FROM Views
WHERE author_id = viewer_id
ORDER BY 1 ;