function sum_odd_5000() {
    var sum = 0;
    for (var i = 1 ; i < 5001 ; i++)
    {
        if (i % 2 != 0)
        {
            sum += i;    
        }
        
    }
    return sum; 
}