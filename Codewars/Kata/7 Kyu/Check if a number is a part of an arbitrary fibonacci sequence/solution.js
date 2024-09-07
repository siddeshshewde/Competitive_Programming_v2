/*
Problem     : Check if a number is a part of an arbitrary fibonacci sequence
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/56dc83840a10fee472000ca1/train/javascript
*/

function isFibo(a,b,f) {
    if (a == f || b == f)
        return true;
    let c = 0;
    while(true)
    {
        c = a + b;
        if (c == f)
          return true;
        else if (c > f)
          return false;
        a = b;
        b = c;
    }
    return false;
}