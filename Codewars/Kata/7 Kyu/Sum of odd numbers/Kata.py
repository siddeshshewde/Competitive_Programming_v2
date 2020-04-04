def row_sum_odd_numbers(n):
    start = n ** 2 - (n - 1)
    return sum(range(start, start + n * 2, 2))