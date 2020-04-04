public class Kata {
  public static int rentalCarCost(int d) {
    if (d < 3)
        return d * 40;
    if (d < 7)
        return d * 40 - 20;
    else 
        return d * 40 - 50;
  }
}
