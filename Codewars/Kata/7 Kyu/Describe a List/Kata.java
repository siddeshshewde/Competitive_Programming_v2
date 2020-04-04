import java.util.*;

public class Kata {

  public static String describeList(final List list) {
    if (list.size() == 0)
        return "empty";
    if (list.size() > 1)
        return "longer";
    else
        return "singleton";
  }
  
}