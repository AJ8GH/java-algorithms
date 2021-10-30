package algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseTest {
    private static Reverse victim;
    private List<Integer> list;
    private List<Integer> expected;

    @BeforeAll
    public static void setUp() {
        victim = new Reverse();
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
}
