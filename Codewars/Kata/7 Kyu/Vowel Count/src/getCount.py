def getCount(s):
    num_vowels = 0
    vowels_list = ("a", "e", "i", "o", "u")
    for vowel in vowels_list:
        num_vowels += s.count(vowel)
    return num_vowels
