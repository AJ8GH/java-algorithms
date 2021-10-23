package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private BubbleSort victim;

    @BeforeEach
    public void setUp() {
        victim = new BubbleSort();
    }

    @Test
    public void sortEmptyList() {
        List<Integer> input = emptyList();
        assertEquals(input, victim.sort(input));
    }

    @Test
    public void sortSingletonList() {
        List<Integer> input = singletonList(1);
        assertEquals(input, victim.sort(input));
    }

    @Test
    public void sortTwoElementList() {
        List<Integer> input = Arrays.asList(2, 1);
        List<Integer> expected = Arrays.asList(1, 2);

        assertEquals(expected, victim.sort(input));
    }

    @Test
    public void sortThreeElementList() {
        List<Integer> input = Arrays.asList(3, 1, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3);

        assertEquals(expected, victim.sort(input));
    }

    @Test
    public void sortFiveElementList() {
        List<Integer> input = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        assertEquals(expected, victim.sort(input));
    }

    @Test
    public void sortTenElementList() {
        List<Integer> input = Arrays.asList(7, 5, 9, 3, 8, 1, 6, 4, 2, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertEquals(expected, victim.sort(input));
    }
}
