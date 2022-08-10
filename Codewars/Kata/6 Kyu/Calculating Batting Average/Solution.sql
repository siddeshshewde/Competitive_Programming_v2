/*
Problem     : Calculating Batting Average
Difficulty  : 6 Kyu
URL         : https://www.codewars.com/kata/5994dafcbddc2f116d000024/sql
*/

SELECT
  player_name,
  games,
  TRIM(TO_CHAR(CAST(hits AS decimal) / at_bats,'0.000')) AS batting_average
FROM 
  yankees
WHERE
  at_bats >= 100
ORDER BY
  batting_average DESC;