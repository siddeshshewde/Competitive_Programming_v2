/*
Problem     : Remove Duplicates from Sorted Array
URL         : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/*
Runtime: 1 ms
Beats: 77.22%
Memory: 46.42 MB
Beats: 92.98%
*/