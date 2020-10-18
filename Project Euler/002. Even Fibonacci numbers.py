def evenFibSum(limit) : 
    if (limit < 2): 
        return 0
 
    first = 0
    second = 2
    sum= first + second 
      
    while (second <= limit): 
  
        check = 4 * second + first 
  
        if (check > limit): 
            break
  
        first = second 
        second = check 
        sum += second 
      
    return sum 
  
limit = 4000000
print(evenFibSum(limit)) 