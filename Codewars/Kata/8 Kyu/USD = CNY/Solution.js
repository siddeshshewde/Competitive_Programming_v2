/*
Problem     : USD => CNY
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/5977618080ef220766000022/train/javascript
*/

function usdcny(usd) {
  return (usd * 6.75).toFixed(2) + ' Chinese Yuan'
}