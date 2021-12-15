/*
Problem     : Exclamation marks series #2: Remove all exclamation marks from the end of sentence
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/57faece99610ced690000165/train/javascript
*/

function remove(s){
  while (s && s.slice(-1) == '!') {
  s = s.slice(0,-1);
  }
  return s;
}