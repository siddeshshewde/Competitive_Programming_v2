def odd_one(arr):
    count = 0
    for key in arr:
        if key%2 != 0:
            return count
        count += 1
    return -1