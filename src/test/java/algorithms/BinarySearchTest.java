package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    private BinarySearch victim;

    @BeforeEach
    public void setUp() {
        victim = new BinarySearch();
    }

    @Test
    public void testFind_oneElementList() {
        assertEquals(0, victim.find(singletonList(9), 9));
    }

}
