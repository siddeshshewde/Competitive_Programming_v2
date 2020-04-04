def iq_test(numbers):
    #your code here
    index = 0
    arr = numbers.split(' ')
    evenlist = [x for x in arr if int(x) % 2 == 0]
    oddlist = [x for x in arr if int(x) % 2 != 0]
    if len(evenlist) > 1:
        return arr.index(oddlist[0]) + 1
    else:
        return arr.index(evenlist[0]) + 1
        
    return index