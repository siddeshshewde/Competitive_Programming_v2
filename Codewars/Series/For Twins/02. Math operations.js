/*
Problem     : For Twins: 2. Math operations
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/59c287b16bddd291c700009a/train/javascript
*/

function iceBrickVolume(radius, bottleLength, rimLength) {
    return radius * radius * 2 * (bottleLength - rimLength);
}