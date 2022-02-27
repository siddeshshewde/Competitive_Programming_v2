/*
Problem     : Two Sum
Difficulty  : Easy
URL         : https://leetcode.com/problems/two-sum/
*/

/*
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var twoSum = function(nums, target) {
    for (var i = 0 ; i < nums.length ; i++)
    {
        for (var j = 0 ; j < nums.length ; j++)
        {
            if (nums[i] + nums[j] == target && i != j)
            {
                return [i, j];
            }
        }
    }
};


/*
Runtime: 148 ms, faster than 29.61% of JavaScript online submissions for Two Sum.
Memory Usage: 39.7 MB, less than 65.29% of JavaScript online submissions for Two Sum.
*/