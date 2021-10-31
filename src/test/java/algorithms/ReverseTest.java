package algorithms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.testng.AssertJUnit.assertEquals;

public class ReverseTest {
    private static Reverse victim;
    private List<Integer> list;
    private List<Integer> expected;

    @BeforeClass
    public static void setUp() {
        victim = new Reverse();
    }

    @Test
    public void testReverse_EmptyList() {
        list = emptyList();

        assertEquals(list, victim.reverse(list));
    }

    @Test
    public void testReverse_OneElementList() {
        list = singletonList(1);

        assertEquals(list, victim.reverse(list));
    }

    @Test
    public void testReverse_TwoElementList() {
        list = Arrays.asList(1, 2);
        expected = List.of(2, 1);

        assertEquals(expected, victim.reverse(list));
    }

    @Test
    public void testReverse_ThreeElementList() {
        list = Arrays.asList(1, 2, 3);
        expected = List.of(3, 2, 1);

        assertEquals(expected, victim.reverse(list));
    }

    @Test
    public void testReverse_FourElementList() {
        list = Arrays.asList(1, 2, 3, 4);
        expected = List.of(4, 3, 2, 1);

        assertEquals(expected, victim.reverse(list));
    }

    @Test
    public void testReverse_FiveElementList() {
        list = Arrays.asList(1, 2, 3, 4, 5);
        expected = List.of(5, 4, 3, 2, 1);

        assertEquals(expected, victim.reverse(list));
    }

    @Test
    public void testReverse_TwelveElementList() {
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        expected = List.of(12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        assertEquals(expected, victim.reverse(list));
    }

    @Test
    public void testReverse_FifteenElementList() {
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        expected = List.of(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        assertEquals(expected, victim.reverse(list));
    }
}
