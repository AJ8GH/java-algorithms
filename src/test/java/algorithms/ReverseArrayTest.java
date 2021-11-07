package algorithms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ReverseArrayTest {
    private static Reverse victim;

    private Integer[] array;
    private Integer[] expectedArray;

    @BeforeClass
    public static void setUp() {
        victim = new Reverse();
    }

    @Test
    public void testReverse_OneElementArray() {
        array = new Integer[] { 1 };

        assertArrayEquals(array, victim.reverse(array));
    }

    @Test
    public void testReverse_TwoElementArray() {
        array = new Integer[] { 1, 2 };
        expectedArray = new Integer[] { 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }

    @Test
    public void testReverse_ThreeElementArray() {
        array = new Integer[] { 1, 2, 3 };
        expectedArray = new Integer[] { 3, 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }

    @Test
    public void testReverse_FourElementArray() {
        array = new Integer[] { 1, 2, 3, 4 };
        expectedArray = new Integer[] { 4, 3, 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }

    @Test
    public void testReverse_FiveElementArray() {
        array = new Integer[] { 1, 2, 3, 4, 5 };
        expectedArray = new Integer[] { 5, 4, 3, 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }

    @Test
    public void testReverse_TwelveElementArray() {
        array = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        expectedArray = new Integer[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }

    @Test
    public void testReverse_FifteenElementArray() {
        array = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        expectedArray = new Integer[] { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }
}
