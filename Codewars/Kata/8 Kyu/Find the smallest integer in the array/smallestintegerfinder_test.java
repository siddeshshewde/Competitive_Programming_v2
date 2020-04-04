import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallestIntegerFinderTest {

    @Test
    public void test1(){
        int expected = 8;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,8});
        assertEquals(expected, actual);
    }


    @Test
    public void test2(){
        int expected = -2;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8});
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        int expected = -321423;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{-133,-5666,-89,-12341,-321423, Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }

    @Test
    public void test6(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }

    @Test
    public void test7(){
        int expected = 1;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{1,2,3,4,5,6,7,8,9,10});
        assertEquals(expected, actual);
    }

    @Test
    public void test8(){
        int expected = -10;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{-1,-2,-3,-4,-5,-6,-7,-8,-9,-10});
        assertEquals(expected, actual);
    }
    
    @Test
    public void test9(){
        int expected = -78;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{-78,56,232,12,8});
        assertEquals(expected, actual);
    }


    @Test
    public void test10(){
        int expected = -8;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,-8});
        assertEquals(expected, actual);
    }
}
