import static org.junit.Assert.*;

import org.junit.Test;


public class BankerPlanTest {

    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: fortune"); 
        testing(BankerPlan.fortune(100000, 1, 2000, 15, 1), true);
        testing(BankerPlan.fortune(100000, 1, 9185, 12, 1), false);
        testing(BankerPlan.fortune(100000000, 1, 100000, 50, 1), true);
        testing(BankerPlan.fortune(100000000, 1.5, 10000000, 50, 1), false);
        testing(BankerPlan.fortune(100000000, 5, 1000000, 50, 1), true);
        
        testing(BankerPlan.fortune(9999, 61.8161, 10000, 3, 0), false);
        testing(BankerPlan.fortune(10000, 0, 10000, 2, 0), true);
    }
    //............
    public static boolean fortuneSol(int f0, double p, int c0, int n, double i) {
        int prev_x = f0; int prev_c = c0;
        int nou_x = -1; int nou_c = -1;
        for (int k = 1; k < n; k++) {
            nou_x = (int)Math.floor(prev_x + p/100.0 * prev_x - prev_c);
            nou_c = (int)Math.floor(prev_c + i/100.0 * prev_c);
            prev_x = nou_x; prev_c = nou_c;
        }
        return (nou_x >= 0);
    }
    //............
    @Test
    public void test4() {
        System.out.println("Random Tests");        
        for (int i = 0; i < 200; i++) { 
            int f0 = randInt(100000, 15000000);
            double p  = (double)(randInt(10, 100) / 10);
            int c0 = (int)Math.floor(f0 / 15.0 + randInt(100, 1500));
            int n  = randInt(10, 25);
            double j  = (double)(randInt(10, 80) / 10);
            testing(BankerPlan.fortune(f0, p, c0, n, j), fortuneSol(f0, p, c0, n, j)); 
        }
    }

}
