def how_much_i_love_you(nb_petals):
    nb_petals = nb_petals % 6
    if (nb_petals == 1) :
        return "I love you"
    if (nb_petals == 2) :
        return "a little"
    if (nb_petals == 3) :
         return "a lot"
    if (nb_petals == 4) :
         return "passionately"
    if (nb_petals == 5) :
         return "madly"
    if (nb_petals == 0) :
         return "not at all"