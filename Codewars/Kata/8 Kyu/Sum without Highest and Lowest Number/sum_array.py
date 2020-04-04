def sum_array(arr):
    if (arr == None or len(arr) == 0 or len(arr) == 1) :
           return 0;
    n, m, result = arr[0],arr[0],0;
    for i in arr:
        if i < m:
            m = i;
        elif i > n:
            n = i;
        result = result + i;
    return result - m - n;
