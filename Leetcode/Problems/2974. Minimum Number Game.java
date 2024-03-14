/*
Problem     : Minimum Number Game
Difficulty  : Easy
URL         : https://leetcode.com/problems/minimum-number-game/
*/

class Solution {
    public int[] numberGame(int[] nums) {
        
        Arrays.sort(nums);
        int result[] = new int [nums.length];

        for (int i = 0 ; i < nums.length ; i = i+2)
        {
            result[i] = nums[i+1];
            result[i+1] = nums[i];
        }
        return result;
    }
}

/*
Runtime: 2 ms, faster than 97.18% of Java online submissions for Minimum Number Game.
Memory Usage: 44.18 MB, less than 99.27% of Java online submissions for Minimum Number Game.
*/