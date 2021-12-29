class Player {
    /**
     * Plays a warrior turn.
     *
     * @param {Warrior} warrior The warrior.
     */
    playTurn(warrior) {
        if (warrior.feel().isEmpty() && warrior.maxHealth() != warrior.health())
        {
            warrior.rest();
        }
        else if (warrior.feel().isEmpty())
        {
            warrior.walk();
        }
        else if (!warrior.feel().isEmpty())
        {
            warrior.attack();
        }
    }
}
  
/*
    Warrior Score:	48
    Time Bonus:	    3
    Clear Bonus:	10
    Total Score:	61
*/