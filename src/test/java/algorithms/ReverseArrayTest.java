package algorithms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ReverseArrayTest {
    private static Reverse victim;

    private int[] array;
    private int[] expectedArray;

    @BeforeClass
    public static void setUp() {
        victim = new Reverse();
    }

    @Test
    public void testReverse_OneElementArray() {
        array = new int[] { 1 };

        assertArrayEquals(array, victim.reverse(array));
    }

    @Test
    public void testReverse_TwoElementArray() {
        array = new int[] { 1, 2 };
        expectedArray = new int[] { 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }

    @Test
    public void testReverse_ThreeElementArray() {
        array = new int[] { 1, 2, 3 };
        expectedArray = new int[] { 3, 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }

    @Test
    public void testReverse_FourElementArray() {
        array = new int[] { 1, 2, 3, 4 };
        expectedArray = new int[] { 4, 3, 2, 1 };

        assertArrayEquals(expectedArray, victim.reverse(array));
    }
}
