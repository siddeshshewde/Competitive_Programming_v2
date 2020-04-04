/*
Title:
	Counting Change Combinations

Kata:
	https://www.codewars.com/kata/541af676b589989aed0009e7/train/javascript

Description:
	Write a function that counts how many different ways you can make change for an amount of money, given an array of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2:

	1+1+1+1, 1+1+2, 2+2.
	The order of coins does not matter:

	1+1+2 == 2+1+1
	Also, assume that you have an infinite amount of coins.

Example:	
	Your function should take an amount to change and an array of unique denominations for the coins:

	countChange(4, [1,2]) // => 3
	countChange(10, [5,2,3]) // => 4
	countChange(11, [5,7]) //  => 0

*/

  function countChange (target, arr) {
    if (target <= 0)
      return 0;

    if (!arr) {
      arr = [];
      for (var i = 1; i <= target; i++)
        arr[i] = i;
    }

    var a = []
      , b = [];

    for (var i = 0; i <= target; i++)
      a[i] = b[i] = 0;

    a[0] = 1;

    for (var i = 0; i < arr.length; i++) {

      for (var j = 0; j <= target; j++)
        for (var k = 0; j + k <= target; k += arr[i])
          b[j + k] += a[j];

      for (var j = 0; j <= target; j++)
        a[j] = b[j], b[j] = 0;
    }

    return a[target];
  }