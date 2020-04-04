def better_than_average(class_points, your_points):
    n = (sum(class_points) + your_points) / (len(class_points) + 1)
    if n > your_points: 
        return False 
    else: 
        return True
    
    '''
    One Liner :)
    return your_points > sum(class_points) / len(class_points)
    '''
