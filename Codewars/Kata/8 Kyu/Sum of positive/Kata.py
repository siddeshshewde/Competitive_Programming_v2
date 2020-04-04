def positive_sum(arr):
    sum = 0
    for i in arr:
    	if i > 0:
    		sum += i
    return sum


'''
One Liner :)
def positive_sum(arr):
    return sum(i for i in arr if i > 0)
'''
