#https://projecteuler.net/problem=5

def main():
    n = 1250

    while (True):
        n = n + 1
        i = 1
        while i < 21:
            if (n % i != 0):
                break
            i = i + 1

        if ( i == 21):
            print (n)
            return 1

main()