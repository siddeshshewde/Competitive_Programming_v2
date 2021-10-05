#https://projecteuler.net/problem=6

def main():
    n = 0
    m = 0

    for i in range (1, 101):
        n = n + (i * i)
    
    for i in range (1, 101):
        m = m + i

    m = m * m

    print (abs(n - m))
    
main()  