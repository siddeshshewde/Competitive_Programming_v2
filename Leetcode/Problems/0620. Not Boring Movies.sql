
/*
Problem     : Not Boring Movies
Difficulty  : Easy
URL         : https://leetcode.com/problems/not-boring-movies/
*/

SELECT id, movie, description, rating
FROM Cinema
WHERE description != 'boring' and id % 2 != 0
ORDER BY rating desc;
