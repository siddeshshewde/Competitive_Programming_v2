"""
Problem:
Given a list of integers, write a function that returns the largest sum of non-adjacent
numbers. Numbers can be 0 or negative.
For example, [2, 4, 6, 8] should return 12, since we pick 4 and 8. [5, 1, 1, 5] should
return 10, since we pick 5 and 5.
"""

from typing import List


from typing import List


def max_nonadjacent_sum(arr: List[int]) -> int:
    n = len(arr)
    # If array contains only one number
    if n == 1:
        return arr[0]
    # If array contains two numbers
    if n == 2:
        return max(arr)
    dp = [0] * n
    dp[0], dp[1] = arr[0], max(arr[0], arr[1])
    for i in range(2, n):
        dp[i] = max(dp[i-1], arr[i] + dp[i-2])
    return dp[-1]


if __name__ == "__main__":
    print(max_nonadjacent_sum([2, 4, 6, 8]))
    print(max_nonadjacent_sum([5, 1, 1, 5]))
    print(max_nonadjacent_sum([-5, 1, 1, -5]))
    print(max_nonadjacent_sum([5, 5, 10, 100, 10, 5]))


"""
SPECS:
TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
"""