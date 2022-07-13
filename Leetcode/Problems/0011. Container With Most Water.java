/*
Problem     : Container With Most Water
Difficulty  : Medium
URL         : https://leetcode.com/problems/container-with-most-water
*/

class Solution {
    public int maxArea(int[] A) {
        int l = 0;
        int r = A.length -1;
        int area = 0;
     
        while (l < r)
        {
            // Calculating the max area
            area = Math.max(area, Math.min(A[l], A[r]) * (r - l));
                         
            if (A[l] < A[r])
                l += 1;
                 
            else
                r -= 1;
        }
        return area;
    }
}

/*
Runtime: 5 ms, faster than 55.59% of Java online submissions for Container With Most Water.
Memory Usage: 81.5 MB, less than 19.57% of Java online submissions for Container With Most Water.
*/