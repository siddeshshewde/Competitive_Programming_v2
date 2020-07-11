def productExceptSelf(arr):
    solution = []
    
    for i in range(0, len(arr)):
        product = 1
        for j in range(0, len(arr)):
            if i==j:
                continue
            product *= arr[j]
        
        solution.append(product)        
        
    return solution
    
    
print (productExceptSelf([1, 2, 3, 4, 5])) == [120, 60, 40, 30, 24]
print (productExceptSelf([3, 2, 1]))       == [2, 3, 6]
print (productExceptSelf([1]))             == [1]
print (productExceptSelf([10, 15, 3, 7]))  == [315, 210, 1050, 450]
