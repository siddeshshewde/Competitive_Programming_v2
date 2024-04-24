/*
Problem     : N-th Tribonacci Number
URL         : https://leetcode.com/problems/n-th-tribonacci-number/
*/

class Solution {
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int num = 0;
        for (int i = 3 ; i <= n ; i++)
        {
            num = a + b + c;
            a = b;
            b = c;
            c = num;
        }
        return num;
    }
}

/*
Runtime: 0 ms
Beats: 100.00%
Memory: 40.04 MB
Beats: 73.00%
*/