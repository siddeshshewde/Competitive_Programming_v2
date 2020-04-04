public class Slope
{

  public String slope(int[] points)
    {
        int numerator = points[3]-points[1];
        int denominator = points[2]-points[0];
        if (denominator==0)
          return "undefined";
        return String.format("%s", numerator/denominator);
		}

}