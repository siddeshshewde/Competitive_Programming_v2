import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class TwoToOneTest {

    public static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    public static String doEx(int k) {
        String res = "";
        int n = -1;
        for (int i = 0; i < 15; i++) {
            n = randInt(97+k, 122); 
            for (int j = 0; j < randInt(1, 5); j++)
                res += (char)n;
        }
        return res;
    }
    public static String longestSol (String s1, String s2) {
        int[] alpha1 = new int[26];
        for(int i = 0 ; i < alpha1.length ; i++) alpha1[i] = 0;
        int[] alpha2 = new int[26];
        for(int i = 0 ; i < alpha2.length ; i++) alpha2[i] = 0;
        for(int i = 0; i < s1.length(); i++) {
            int c = (int)s1.charAt(i);
            if (c >= 97 && c <= 122)
                alpha1[c - 97]++;
        }
        for(int i = 0; i < s2.length(); i++) {
            int c = (int)s2.charAt(i);
            if (c >= 97 && c <= 122)
                alpha2[c - 97]++;
        }
        String res = "";
        for(int i = 0; i < 26; i++) {            
            if (alpha1[i] != 0) {
                res += (char)(i+97);
                alpha2[i] = 0;
            }
        }
        for(int i = 0; i < 26; i++) {            
            if (alpha2[i] != 0)
                res += (char)(i+97);
        }
        String[] lstr = res.split("");        
        Arrays.sort(lstr);
        res = String.join("", lstr);
        return res;
    }
    //.........................
    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
        assertEquals("adefghklmnorstu", TwoToOne.longest("lordsofthefallen", "gamekult"));
        assertEquals("acdeorsw", TwoToOne.longest("codewars", "codewars"));
        assertEquals("acdefghilmnorstuw", TwoToOne.longest("agenerationmustconfrontthelooming", "codewarrs"));
    }
    @Test
    public void test1() {
        System.out.println("200 Random Tests");
        for (int i = 0; i < 200; i++) { 
            String s1 = doEx(randInt(1, 10));
            String s2 = doEx(randInt(1, 8));
            //System.out.println(s1);
            //System.out.println(s2);
            //System.out.println(longestSol(s1, s2));
            //System.out.println("****");
            assertEquals(longestSol(s1, s2), TwoToOne.longest(s1, s2));
        }
    }
}
