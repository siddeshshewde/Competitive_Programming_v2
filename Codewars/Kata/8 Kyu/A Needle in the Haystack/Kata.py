def find_needle(haystack):
    for a in range(len(haystack)):
        if haystack[a] == 'needle':
            return 'found the needle at position ' + str(a)
    