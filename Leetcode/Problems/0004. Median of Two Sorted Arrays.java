/*
Problem     : Median of Two Sorted Arrays
Difficulty  : High
URL         : https://leetcode.com/problems/median-of-two-sorted-arrays/
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = 0;
        int n = nums1.length+nums2.length;
        int [] new_array = new int [n];
        for (int i = 0 ; i < nums1.length ; i++)
        {
            new_array[count++] = nums1[i];
        }
        
        for (int i = 0 ; i < nums2.length ; i++)
        {
            new_array[count++] = nums2[i];
        }
        Arrays.sort(new_array);
        n = n - 1;
        
        if ((n+1) % 2 == 0)
        {
            double answer = ((double)new_array[(int)n/2] + (double)new_array[(int)n/2+1]) / 2;
            return answer;
        }
        double answer = new_array[(int)n/2];
        return answer;
    }
}

/*
Runtime: 6 ms, faster than 34.36% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 50.8 MB, less than 7.19% of Java online submissions for Median of Two Sorted Arrays.
*/