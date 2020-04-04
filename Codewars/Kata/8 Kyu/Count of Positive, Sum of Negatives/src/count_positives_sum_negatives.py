def count_positives_sum_negatives(arr):
    if not arr :
        return []
    p = 0
    n = 0
    for i in arr :
        if i > 0 :
            p = p + 1
        else :
            n = n + i
    return [p, n]