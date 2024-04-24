/*
Problem     : Majority Element
URL         : https://leetcode.com/problems/majority-element/
*/

class Solution {
    public int majorityElement(int[] nums) {
        int element;
        int count = 0;

        HashMap <Integer, Integer> a = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (a.containsKey(nums[i]))
            {
                a.put(nums[i], a.get(nums[i])+1);
                if (a.get(nums[i]) > nums.length/2)
                {
                    return nums[i];
                }
            }
            else
            {
                a.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}

/*
Runtime: 19 ms
Beats: 11.26%
Memory: 48.88 MB
Beats: 95.57%
*/