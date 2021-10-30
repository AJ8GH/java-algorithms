package algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseTest {
    private static Reverse victim;

    @BeforeAll
    public static void setUp() {
        victim = new Reverse();
    }

    @Test
    public void testReverse_OneElementList() {
        List<Integer> list = singletonList(1);

        assertEquals(list, victim.reverse(list));
    }

    @Test
    public void testReverse_TwoElementList() {
        List<Integer> list = Arrays.asList(1, 2);
        List<Integer> expected = List.of(2, 1);

        assertEquals(expected, victim.reverse(list));
    }
}
