import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

  /**
   * Function to run the program.
   *
   * @param args The args for the program.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = Integer.parseInt(in.nextLine());
    for (int t = 1; t <= tests; ++t) {
      try {
        System.out.print("Case #" + t + ": ");

        List<Printer> printers = new ArrayList<>();
        for (int ink = 0; ink < 3; ink++) {
          printers.add(Printer.fromStr(in.nextLine()));
        }

        int[] results = new int[4];
        Arrays.fill(results, Integer.MAX_VALUE);

        for (Printer printer : printers) {
          results[0] = Math.min(printer.cyan, results[0]);
          results[1] = Math.min(printer.magenta, results[1]);
          results[2] = Math.min(printer.yellow, results[2]);
          results[3] = Math.min(printer.black, results[3]);
        }

        // Check if solution is possible.
        long sum = Arrays.stream(results).mapToLong(one -> (long) one)
            .reduce((one, two) -> one + two)
            .orElse(0);

        if (sum < 1000000L) {
          System.out.println("IMPOSSIBLE");
        } else {
          sum = 1000000L;
          int index = 0;
          while (index < 4) {
            long val = Math.min(results[index++], sum);
            sum -= val;
            System.out.print(val);
            if (index < 4) {
              System.out.print(' ');
            }
            if (sum < 0) {
              throw new Exception("Error!");
            }
          }
          System.out.println();
        }

      } catch (Exception e) {
        // System.out.println("Case #" + t + ": ");
      }
    }
  }

  private static class Printer {

    private int cyan;
    private int magenta;
    private int yellow;
    private int black;

    private Printer(int cyan, int magenta, int yellow, int black) {
      this.cyan = cyan;
      this.magenta = magenta;
      this.yellow = yellow;
      this.black = black;
    }

    private static Printer fromStr(String str) {
      int[] vals = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
      return new Printer(vals[0], vals[1], vals[2], vals[3]);
    }
  }
}