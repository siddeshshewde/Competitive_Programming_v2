function findMax(arr) {
    var max = arr[0];
    for (var i in arr)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max; 
}