def fibs(n):
    a, b = 0, 1
    print('0\n1')
    while n:
        a, b = b, a + b
        print(b)
        n-=1

fibs(10)