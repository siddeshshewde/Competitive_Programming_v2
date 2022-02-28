"""
This problem was asked by Apple.

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
"""

import time

def f():
    print ("Inside Function")

def job_scheduler(n):
    time.sleep(n)
    f()

if __name__ == "__main__":
    job_scheduler(1)
    job_scheduler(2)
    job_scheduler(3)