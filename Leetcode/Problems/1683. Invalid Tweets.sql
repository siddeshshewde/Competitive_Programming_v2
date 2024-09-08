/*
Problem     : Invalid Tweets
Difficulty  : Easy
URL         : https://leetcode.com/problems/invalid-tweets/description
*/

SELECT tweet_id
FROM tweets
WHERE LENGTH(content) > 15;