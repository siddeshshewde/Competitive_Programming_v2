import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GrassHopperTest {
    String solution(int temperature) {
        int c = (int) (temperature - 32 + (5/9.0));
        return c + (c > 0 ? " is freezing temperature" : " is above freezing temperature");
    }
    
    @Test
    public void test1() {
        assertEquals(solution(56), GrassHopper.weatherInfo(56));
    }
    @Test
    public void test2() {
        assertEquals(solution(23), GrassHopper.weatherInfo(23));
    }
    @Test
    public void test3() {
        assertEquals(solution(33), GrassHopper.weatherInfo(33));
    }
    @Test
    public void test4() {
        assertEquals(solution(5), GrassHopper.weatherInfo(5));
    }
}