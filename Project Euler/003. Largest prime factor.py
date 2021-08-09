#https://projecteuler.net/problem=3

import math

def largest_prime_factor(n): 
    maxPrime = -1

    while n % 2 == 0: 
        maxPrime = 2
        n >>= 1
    
    for i in range(3, int(math.sqrt(n)) + 1, 2): 
        while n % i == 0: 
            maxPrime = i 
            n //= i 
    
    return n if n > 2 else maxPrime
  
print(largest_prime_factor(600851475143))
