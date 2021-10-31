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
}
