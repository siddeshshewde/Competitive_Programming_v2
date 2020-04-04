import java.util.Arrays;
import java.util.Vector;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        Vector result = new Vector();
        for (long i = m; i <= n; i++) {
            Vector vector = new Vector();
            for (long j = 1; j <= m; j++) {
                if (m % j == 0) {
                    vector.addElement(j * j);
                }
            }
            long sum = 0;
            for (int j = 0; j < vector.size(); j++) {
                sum = sum + (long) vector.get(j);
            }
            if(Math.sqrt(sum) -(int)Math.sqrt(sum) == 0){
                long[] item = new long[]{m,sum};
                result.addElement(Arrays.toString(item));
            }
            m++;
        }
        return Arrays.toString(result.toArray());
    }

    public static void main(String[] args) {
        SumSquaredDivisors sumSquaredDivisors = new SumSquaredDivisors();
        System.out.println(sumSquaredDivisors.listSquared(1,10000));
    }
}