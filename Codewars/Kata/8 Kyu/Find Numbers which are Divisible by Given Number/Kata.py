def divisible_by(numbers, divisor):
    number = []
    for i in numbers: 
        if i % divisor == 0: number.append(i)
    return number