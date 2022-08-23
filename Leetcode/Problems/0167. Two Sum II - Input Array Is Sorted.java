/*
Problem  : Two Sum II - Input Array Is Sorted
Link     : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int i = 0, j = len - 1;
        int sum = numbers[i] + numbers[j];
        while(sum != target){
            if(sum < target) 
                i++;
            else 
                j--;
            sum = numbers[i] + numbers[j];
        }
        return new int[]{i + 1, j + 1};
    }
}

/*
Runtime: 1 ms, faster than 99.47% of Java online submissions for Two Sum II - Input Array Is Sorted.
Memory Usage: 50.8 MB, less than 9.55% of Java online submissions for Two Sum II - Input Array Is Sorted.
*/