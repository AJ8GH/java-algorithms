package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    private Fibonacci victim;

    @BeforeEach
    public void setUp() {
        victim = new Fibonacci();
    }

    @Test
    public void testGetSequence_OneNumber() {
        assertEquals(singletonList(0), victim.getSequence(1));
    }
}
