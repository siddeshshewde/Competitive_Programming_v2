/*
Problem     : Beginner Series #3 Sum of Numbers
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/55f2b110f61eb01779000053/train/javascript
*/

function getSum( a,b )
{
    let sum = 0
    
    if (a > b)
    {
      c=a
      a=b
      b=c
    }
    
    for (let i = a ; i < b+1 ; i++)
         sum += i
    
    return sum
}