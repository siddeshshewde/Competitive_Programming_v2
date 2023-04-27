function findAvg(arr) {
    var avg = 0;
    for (var i in arr)
    {
        avg += arr[i];
    }
    return avg/arr.length;
}