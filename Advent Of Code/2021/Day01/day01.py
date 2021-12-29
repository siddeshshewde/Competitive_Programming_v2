'''
Title:         Day 1: Sonar Sweep
Link:          https://adventofcode.com/2021/day/1
Puzzle Input:  https://adventofcode.com/2021/day/1/input
'''

import os

def solution1(input):
    count = 0
    for i in range(1, len(input)):
        if input[i] > input[i-1]:
            count += 1
    return count 

def solution2(input):
    count = 0
    for i in range(0, len(input)-3):
        if input[i] < input[i+3]:
            count += 1
    return count

if __name__ == "__main__":
    dir = os.path.abspath(os.path.dirname(__file__))
    with open(os.path.join(dir, "input.in")) as file:
        _input = [int(i) for i in file.read().strip().split("\n")]

    print(solution1(_input)) # 1301
    print(solution2(_input)) # 608