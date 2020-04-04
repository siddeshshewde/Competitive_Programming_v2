def high_and_low(numbers):
    numbers = [int(num) for num in numbers.split(" ")]
    return "%i %i" %(max(numbers), min(numbers))