/*
Problem     : Remove Element
Difficulty  : Easy
URL         : https://leetcode.com/problems/remove-element/
*/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i, j = 0, length = nums.length;

        for (i = 0; i < nums.length; i++) 
        {
            if (nums[i] != val) 
            {
                nums[j++] = nums[i];
            }
            else 
            {
                length--;
            }    
        }
        return length;
    }
}

/*
Runtime: 1 ms, faster than 35.63% of Java online submissions for Remove Element.
Memory Usage: 43.2 MB, less than 7.28% of Java online submissions for Remove Element.
*/