/*
Problem     : Driving School Series #1
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/58999425006ee3f97c00011f/train/javascript
*/

function passed (list) { 
    var solution = 0, pass = 0;
    for (var i = 0 ; i < list.length ; i++)
    {
        if (list[i] < 19)
        {
            solution = solution + list[i];
            pass++;
        }
    }
    if (pass == 0)
        return "No pass scores registered.";
    return Math.round(solution/pass);

} 