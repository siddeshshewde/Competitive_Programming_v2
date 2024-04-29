/*
Problem     : Frog's Dinner
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/65f361be2b30ec19b78d758f/train/javascript
*/

function summation (n) {
  let sum = 0;
  for (let i = 1 ; i <=n ; i++)
  {
      sum = sum + i;
  }
  return sum;
}

function frogContest(n) {
  let number = {};
  number[0] = summation(n);
  number[1] = summation(Math.floor(number[0]/2));
  number[2] = summation(number[0] + number[1]);
  return `Chris ate ${number[0]} flies, Tom ate ${number[1]} flies and Cat ate ${number[2]} flies`
}
