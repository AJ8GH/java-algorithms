package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    private BinarySearch victim;

    @BeforeEach
    public void setUp() {
        victim = new BinarySearch();
    }

    @Test
    public void testFind_OneElementList() {
        assertEquals(0, victim.find(singletonList(9), 9));
    }

    @Test
    public void testFind_TwoElementList() {
        assertEquals(1, victim.find(List.of(2, 9), 9));
    }

    @Test
    public void testFind_ElementNotPresent() {
        assertEquals(-1, victim.find(List.of(2, 6), 9));
    }

    @Test
    public void testFind_ThreeElementList_AtElementZero() {
        assertEquals(0, victim.find(List.of(2, 6, 9), 2));
    }

    @Test
    public void testFind_ThreeElementList_AtElementOne() {
        assertEquals(1, victim.find(List.of(2, 6, 9), 6));
    }

    @Test
    public void testFind_ThreeElementList_AtElementTwo() {
        assertEquals(2, victim.find(List.of(2, 6, 9), 9));
    }

    @Test
    public void testFind_FourElementList() {
        assertEquals(1, victim.find(List.of(2, 6, 7, 9), 6));
    }

    @Test
    public void testFind_ElevenElementList_AtElementSeven() {
        List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20);
        assertEquals(7, victim.find(list, 13));
    }

    @Test
    public void testFind_ElevenElementList_AtElementEight() {
        List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20);
        assertEquals(8, victim.find(list, 14));
    }

    @Test
    public void testFind_ElevenElementList_AtElementSix() {
        List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20);
        assertEquals(6, victim.find(list, 10));
    }

    @Test
    public void testFind_ElevenElementList_AtElementThree() {
        List<Integer> list = List.of(2, 3, 5, 6, 7, 9, 10, 13, 14, 17, 20);
        assertEquals(3, victim.find(list, 6));
    }
}
