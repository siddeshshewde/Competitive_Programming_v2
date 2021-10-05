#https://projecteuler.net/problem=7

def main():
    primeCount = 2
    n = 3

    while (primeCount <= 10001):
        i = 2
        while i < n:
            if n % i == 0:
                break
            i = i + 1
        
        if i == n:
            primeCount = primeCount + 1

        n = n + 1
    return n

print (main())  