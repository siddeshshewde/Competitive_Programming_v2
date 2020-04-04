import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;


public class TriangleNumbersTest {

	@Test
	public void test1() {
		assertEquals(TriangleNumbers.isTriangleNumber(125250), true);
	}
	@Test
	public void test2() {
		assertEquals(TriangleNumbers.isTriangleNumber(3126250), true);
	}
 }