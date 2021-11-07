package algorithms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertArrayEquals;

public class BubbleSortArrayTest {
    private static BubbleSortArray victim;

    @BeforeClass
    public static void setUp() {
        victim = new BubbleSortArray();
    }

    @Test
    public void sortEmptyArray() {
        Integer[] array = new Integer[] {};
        assertArrayEquals(array, victim.sort(array));
    }

    @Test
    public void sortSingletonArray() {
        Integer[] array = new Integer[] { 1 };
        assertArrayEquals(array, victim.sort(array));
    }

    @Test
    public void sortTwoElementArray() {
        Integer[] array = new Integer[] { 2, 1 };
        Integer[] expected = new Integer[] { 1, 2 };

        assertArrayEquals(expected, victim.sort(array));
    }

    @Test
    public void sortThreeElementArray() {
        Integer[] array = new Integer[] { 3, 1, 2 };
        Integer[] expected = new Integer[] { 1, 2, 3 };

        assertArrayEquals(expected, victim.sort(array));
    }

    @Test
    public void sortFiveElementArray() {
        Integer[] array = new Integer[] { 5, 3, 1, 4, 2 };
        Integer[] expected = new Integer[] { 1, 2, 3, 4, 5 };

        assertArrayEquals(expected, victim.sort(array));
    }

    @Test
    public void sortTenElementArray() {
        Integer[] array = new Integer[] { 7, 5, 9, 3, 8, 1, 6, 4, 2, 10 };
        Integer[] expected = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        assertArrayEquals(expected, victim.sort(array));
    }


    @Test
    public void sortTwentyElementArray() {
        Integer[] array = new Integer[] {
                7, 11, 5, 13, 9, 12, 19, 15, 17, 3, 8, 1, 16, 6, 20, 4, 2, 18, 14, 10
        };
        Integer[] expected = new Integer[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        };

        assertArrayEquals(expected, victim.sort(array));
    }
}
