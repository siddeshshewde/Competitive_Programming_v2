import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int [] ans = new int [n];
        for (int j = 0 ; j < customers.length ; j++)
        {
            ans[0] = ans[0] + customers[j];
            Arrays.sort(ans);
        }
        return ans[n-1];
    }
    
}