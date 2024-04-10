/*
Problem     : Find All Duplicates in an Array
Difficulty  : Medium
URL         : https://leetcode.com/problems/find-all-duplicates-in-an-array
*/

import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer, Integer> a = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0 ; i < nums.length ; i++)
        {
            if(a.containsKey(nums[i]))
            {
                a.put(nums[i], a.get(nums[i])+1);
                
                if (a.get(nums[i]) == 2)
                {
                    result.add(nums[i]);
                }
            }
            
            else
            {
                a.put(nums[i], 1);
            }
        }        
        return result;
    }
}

/*
Runtime: 23 ms, faster than 12.35% of Java online submissions for Reverse Integer.
Memory Usage: 55.65 MB, less than 5.97% of Java online submissions for Reverse Integer.
*/