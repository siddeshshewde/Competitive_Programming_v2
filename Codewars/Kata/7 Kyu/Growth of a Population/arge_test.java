import static org.junit.Assert.*;

import org.junit.Test;

public class ArgeTest {

    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");    
        testing(Arge.nbYear(1500, 5, 100, 5000),15);
        testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
        testing(Arge.nbYear(1500000, 0.25, -1000, 2000000), 151);
        testing(Arge.nbYear(1500000, 0.25, 1, 2000000), 116);
        testing(Arge.nbYear(1500000, 0.0, 10000, 2000000), 50);
    }
    //............
    private static int nbYearSol(int p0, double percent, int aug, int p) {
        int i = 1;
        double mult = 1 + percent / 100.0;
        double prev = p0;
        while (prev < p) {
            double ne = Math.floor(prev * mult + aug);
            prev = ne;
            i++;
        }
        return (i - 1);
    }
    //............
    @Test
    public void test4() {
        System.out.println("Random Tests");        
        for (int i = 0; i < 100; i++) { 
            int p0 = randInt(10000, 15000000);
            double percent = randInt(50, 1000) / 100.0;
            int aug = (int)(p0 / 200.0);
            int k = randInt(5, 100);
            int p = p0 + k * aug; 
            testing(Arge.nbYear(p0, percent, aug, p), nbYearSol(p0, percent, aug, p)); 
        }
    }
}
