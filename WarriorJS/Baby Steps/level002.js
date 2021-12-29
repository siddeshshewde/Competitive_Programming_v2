class Player {
    playTurn(warrior) {
        if (warrior.feel().isEmpty())
        {
            warrior.walk();
        }
        else
        {
            warrior.attack();
        }
    }
}
  
/*
    Warrior Score:	12
    Time Bonus:	    10
    Clear Bonus:	4
    Total Score:	26
*/