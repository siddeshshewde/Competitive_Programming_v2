#https://projecteuler.net/problem=4
def main():
    max = 0
    while i in range(999, 1):
        while j in range(999, 1):
            if palindrome_check(i * j):
                if i * j > max:
                    max = i * j
    return max

def palindrome_check(n):
    return n == int("".join(reversed(str(n))))
