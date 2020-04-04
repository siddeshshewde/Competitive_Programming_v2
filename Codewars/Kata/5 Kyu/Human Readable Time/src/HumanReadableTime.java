public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int hours = seconds / 3600;
    seconds = seconds - hours * 3600;
    int minutes = seconds / 60;
    seconds = seconds - minutes * 60;
    String ans = "";
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }
}