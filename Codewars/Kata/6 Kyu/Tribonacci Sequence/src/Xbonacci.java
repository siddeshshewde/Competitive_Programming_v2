public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      double a[] = new double [n];
      for (int i=0;i<s.length && i<n;i++)
      {
          a[i] = s[i];
      }
      for (int j=s.length;j<n;j++)
      {
          a[j] = a[j-1]+a[j-2]+a[j-3];
      }
      return a;
  }
}