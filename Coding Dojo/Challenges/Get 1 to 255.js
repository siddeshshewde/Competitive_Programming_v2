function get_array() {
    var arr = [];
    for (var i = 1 ; i < 256 ; i++)
    {
        arr[i-1] = i;
    }
    return arr; 
}
