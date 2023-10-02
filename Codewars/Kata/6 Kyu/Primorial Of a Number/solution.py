"""
Problem     : Primorial Of a Number
Difficulty  : 6 Kyu
URL         : https://www.codewars.com/kata/5a99a03e4a6b34bb3c000124/train/python
"""

def num_primorial(n):
    a = 1
    i = 3
    ans = 2
    
    while a < n:
        if check_prime(i):
            ans = ans * i
            a += 1
        i = i + 2
    return ans
            
def check_prime(n):
    j = 0
    for i in range (2, n+1):
        if (n % i == 0):
            j = i
            break

    if j == n:
        return True
    return False