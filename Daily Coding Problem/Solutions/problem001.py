def check_sum(arr, target):
    potential_solutions = []
    
    for num in arr:
        if num in potential_solutions:
            return True
        
        potential_solutions.append(target-num)
        
    return False
    
    
print (check_sum([10, 15, 3, 7], 19))
print (check_sum([10, 15, 3, 4], 17))
print (check_sum([], 17))
print (check_sum([10, 15, 3, 7],17))