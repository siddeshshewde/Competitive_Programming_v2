import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
      int result = 0;
      for (int [] a : stops)
      {
          result = result + a[0] - a[1];
      }
      return result;
  }
}