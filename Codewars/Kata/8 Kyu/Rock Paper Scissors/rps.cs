using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

public class Kata
{
  public string Rps(string p1, string p2)
  {
     if (p2 == p1)
        return "Draw!";
    int result = (p1 + p2) == ("scissorspaper") || (p1 + p2) == ("paperrock") || (p1 + p2) == ("rockscissors") ? 1 : 2; 
    return "Player " + result + " won!";
  }
}