# The fibonacci sequence.

'''
The fibonacci sequence starts with 0 and 1. You then take those two, and add them together, and add that to the sequence. So the sequence is now 0 1 1. Each new number is the previous two numbers, added together. So the sequence goes 0 1 1 2 3 5 8 13 21 34 etc.

The challenge is to print the first 100 fibonacci numbers in the least (code golf) or most obscure (code bowling) way you can think of

Edit  Just to clarify the first 100 numbers refers to the first 100 numbers that come out of a fibonacci solution not the first 100 fibonacci numbers
Edit Edit Just to be super super super clear, these are the expected numbers. In some format whether it be 1 number per line or in an array https://hasteb.in/deqotevu
Edit Edit Edit Some languages like javascript have a bit of an issue with numbers that large. As long as the math and first few work it's an okay solution. E.g. expected is 218922995834555169026 but javascript prints 218922995834555200000
'''

def fibs(n):
    a, b = 0, 1
    print('0\n1')
    while n:
        a, b = b, a + b
        print(b)
        n-=1

fibs(10)