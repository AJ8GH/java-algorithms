package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    private Fibonacci victim;

    @BeforeEach
    public void setUp() {
        victim = new Fibonacci();
    }

    @Test
    public void testGetSequence_oneNumber() {
        assertEquals(singletonList(0), victim.getSequence(1));
    }

    @Test
    public void testGetSequence_twoNumbers() {
        assertEquals(List.of(0, 1), victim.getSequence(2));
    }

    @Test
    public void testGetSequence_zeroNumbers() {
        assertEquals(emptyList(), victim.getSequence(0));
    }

    @Test
    public void testGetSequence_threeNumbers() {
        assertEquals(List.of(0, 1, 1), victim.getSequence(3));
    }
}
