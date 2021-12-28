'''
Problem     : Digit Counts
Difficulty  : Easy
URL         : https://www.lintcode.com/problem/3/
'''
class Solution:
    """
    @param k: An integer
    @param n: An integer
    @return: An integer denote the count of digit k in 1..n
    """
    def digitCounts(self, k, n):
        count = 0
        for i in range (0, n+1):
            a = i
            while a > 0:
                if a%10 == k:
                    count += 1
                a = int(a/10)
        if k == 0:
            return count + 1
        return count

'''
time cost: 122ms
memory cost: 5.89MB
beat percent: 47.60%
'''