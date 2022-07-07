// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product[] = new int [nums.length];

        product[0] = 1;

        for (int i = 1; i < nums.length; i++) 
        {
            product[i] = nums[i - 1] * product[i - 1];
        }

        int suffixProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--)
        {
            product[i] = product[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return product;
    }
}

/*
Runtime: 2 ms, faster than 88.02% of Java online submissions for Product of Array Except Self.
Memory Usage: 58.6 MB, less than 4.36% of Java online submissions for Product of Array Except Self.
*/