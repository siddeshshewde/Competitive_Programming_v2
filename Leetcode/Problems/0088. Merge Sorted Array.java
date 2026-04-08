/*
Problem     : Merge Sorted Array
URL         : https://leetcode.com/problems/merge-sorted-array/description
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = nums1.length;
        while (k!=0) {
            if (m == 0) {
                nums1[k-1] = nums2[n-1];
                n--;
            }
            else if (n == 0) {
                nums1[k-1] = nums1[m-1];
                m--;
            }
            else if (nums1[m-1] > nums2[n-1]) {
                nums1[k-1] = nums1[m-1];
                m--;
            } else {
                nums1[k-1] = nums2[n-1];
                n--;
            }
            k--;
        }
    }
}

/*
Runtime: 0 ms
Beats: 100%
Memory: 43.68 MB
Beats: 83.08%
*/