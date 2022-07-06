/*
Problem     : Best Time to Buy and Sell Stock
Difficulty  : Easy
URL         : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int maxP = 0;
        int profit = 0;
        
        while (right < prices.length)
        {
            if (prices[left] < prices[right])
            {
                profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            }
            else
            {
                left = right;
            }
            right = right + 1;
        }
        return maxP;
    }
}

/*
Runtime: 2 ms, faster than 93.08% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 85 MB, less than 7.62% of Java online submissions for Best Time to Buy and Sell Stock.
*/