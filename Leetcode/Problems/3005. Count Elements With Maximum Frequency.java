/*
Problem     : Count Elements With Maximum Frequency
Difficulty  : Easy
URL         : https://leetcode.com/problems/count-elements-with-maximum-frequency/
*/

import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++)
        {
            if(map. containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        int count = 0;
        int max_freq = 0;

        for (Map.Entry<Integer,Integer> mapElement : map.entrySet())
        {
            int key = mapElement.getKey();
            int value = mapElement.getValue();
            if (value == max_freq)
            {
                count += value;
            }
            else if (value > max_freq)
            {
                count = value;
                max_freq = value;
            }
        }
        return count;
    }
}

/*
Runtime: 3 ms, faster than 30.76% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 41.88 MB, less than 86.81% of Java online submissions for Median of Two Sorted Arrays.
*/