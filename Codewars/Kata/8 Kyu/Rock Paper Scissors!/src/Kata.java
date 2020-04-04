public class Kata {
  public static String rps(String p1, String p2) {
    if (p2 == p1)
        return "Draw!";
    int result = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("paperrock") || (p1 + p2).equals("rockscissors") ? 1 : 2; 
    return "Player " + result + " won!";
  }
}