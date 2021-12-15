/*
Problem     : Computer problem series #1: Fill the Hard Disk Drive
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/5d49c93d089c6e000ff8428c/train/javascript
*/

function save(sizes, hd) {
    let sum = 0;
    let count = 0;
    for (const s of sizes)
    {
        sum = sum + s;
        if (sum > hd)
            return count;
        count += 1;
    }
    return count;
}