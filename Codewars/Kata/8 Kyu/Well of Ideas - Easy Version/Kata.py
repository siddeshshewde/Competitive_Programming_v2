def well(x):
    good = 0
    bad = 0
    for i in x:
        if i == 'good':
            good += 1
        elif i == 'bad':
            bad += 1
    if good == 0:
        return 'Fail!'
    elif good > 2:
        return 'I smell a series!'
    else:
        return 'Publish!'