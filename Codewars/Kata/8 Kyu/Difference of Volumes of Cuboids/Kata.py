def find_difference(a, b):
    aa = 1
    bb = 1
    for i in a:
        aa = aa * i
    for i in b:
        bb = bb * i
    if aa > bb:
        return aa-bb
    return bb-aa