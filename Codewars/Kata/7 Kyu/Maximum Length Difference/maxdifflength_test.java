import static org.junit.Assert.*;
import org.junit.Test;

public class MaxDiffLengthTest {
    
    public static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    public static String[] doEx(int k) {
        String[] a1 = new String[k];
        for (int u = 0; u < k; u++) {
            String res = "";
            int n = -1;
            for (int i = 0; i < randInt(1, 15); i++) {
                n = randInt(97, 122); 
                for (int j = 0; j < randInt(1, 4); j++)
                    res += (char)n;
            }
            a1[u] = res;
        }
        return a1;
    }
    public static int mxdiflgSol(String[] a1, String[] a2) {
        int mx = -1;
        for (String x : a1)
            for (String y : a2) {
                int diff = Math.abs(x.length() - y.length());
                if (diff > mx)
                    mx = diff;
            }
        return mx;
    }
  //.........................
    @Test
    public void test() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.mxdiflg(s1, s2)); // 13
        s1 = new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
        s2 = new String[]{"bbbaaayddqbbrrrv"};
        assertEquals(10, MaxDiffLength.mxdiflg(s1, s2)); // 10
        s1 = new String[]{"ccct", "tkkeeeyy", "ggiikffsszzoo", "nnngssddu", "rrllccqqqqwuuurdd", "kkbbddaakkk"};
        s2 = new String[]{"tttxxxxxxgiiyyy", "ooorcvvj", "yzzzhhhfffaaavvvpp", "jjvvvqqllgaaannn", "tttooo", "qmmzzbhhbb"};
        assertEquals(14, MaxDiffLength.mxdiflg(s1, s2)); // 14   
        s1 = new String[]{};
        s2 = new String[]{"bbbaaayddqbbrrrv"};
        assertEquals(-1, MaxDiffLength.mxdiflg(s1, s2)); 
        s1 = new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
        s2 = new String[]{};
        assertEquals(-1, MaxDiffLength.mxdiflg(s1, s2)); 
        s1 = new String[]{};
        s2 = new String[]{};
        assertEquals(-1, MaxDiffLength.mxdiflg(s1, s2)); 
    }
    @Test
    public void test1() {
        System.out.println("100 Random Tests");
        for (int i = 0; i < 100; i++) { 
            String[] s1 = doEx(randInt(1, 10));
            String[] s2 = doEx(randInt(1, 8));
            assertEquals(mxdiflgSol(s1, s2), MaxDiffLength.mxdiflg(s1, s2));
        }
    }
    

}
