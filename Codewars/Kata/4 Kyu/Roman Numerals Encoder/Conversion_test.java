import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionTest {
    private Conversion conversion = new Conversion();
    private Random rnd = new Random();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
        assertEquals("solution(14) should equal to XIV", "XIV", conversion.solution(14));
        assertEquals("solution(21) should equal to XXI", "XXI", conversion.solution(21));
        assertEquals("solution(89) should equal to LXXXIX", "LXXXIX", conversion.solution(89));
        assertEquals("solution(91) should equal to XCI", "XCI", conversion.solution(91));
        assertEquals("solution(984) should equal to CMLXXXIV", "CMLXXXIV", conversion.solution(984));
        assertEquals("solution(1000) should equal to M", "M", conversion.solution(1000));
        assertEquals("solution(1889) should equal to MDCCCLXXXIX", "MDCCCLXXXIX", conversion.solution(1889));
        assertEquals("solution(1989) should equal to MCMLXXXIX", "MCMLXXXIX", conversion.solution(1989));
    }
    
    private String roman(int n) {
        int[] ints = new int[]{1000, 900,  500, 400, 100,  90, 50,  40, 10,  9,   5,  4,   1};
        String[] nums = new String[]{"M",  "CM", "D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        for (int i = 0; i < ints.length; i++) {
            int count = n / ints[i];
            result += new String(new char[count]).replace("\0", nums[i]);
            n -= ints[i] * count;
        }
        return result;
    }
    
    @Test
    public void randomTests() {
        for(int i=0; i<100; i++) {
            int n = rnd.nextInt(3888)+1;
            assertEquals("Testing for: "+n , roman(n), conversion.solution(n));
        }
    }
}
