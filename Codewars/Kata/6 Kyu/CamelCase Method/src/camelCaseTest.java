import java.util.Arrays;
import java.util.Random;
import org.junit.Test;
import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test public void basicTests() {
        assertEquals("For input \"test case\"", "TestCase", Kata.camelCase("test case"));
        assertEquals("For input \"camel case method\"", "CamelCaseMethod", Kata.camelCase("camel case method"));
        assertEquals("For input \"say hello\"", "SayHello", Kata.camelCase("say hello"));
        assertEquals("For input \"\"", "", Kata.camelCase(""));
    }
}