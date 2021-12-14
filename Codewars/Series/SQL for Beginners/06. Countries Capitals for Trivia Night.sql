/*
Problem     : Countries Capitals for Trivia Night (SQL for Beginners #6)
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5e5f09dc0a17be0023920f6f/train/sql
*/

SELECT capital 
FROM countries
WHERE continent LIKE '%Afri%' and country like 'E%'
ORDER BY capital
LIMIT 3