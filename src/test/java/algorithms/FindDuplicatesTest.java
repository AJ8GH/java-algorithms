package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicatesTest {
    private FindDuplicates victim;

    @BeforeEach
    private void setUp() {
        victim = new FindDuplicates();
    }

    @Test
    public void findDuplicates_emptyList() {
        List<Integer> input = emptyList();
        assertEquals(victim.findDuplicates(input), emptySet());
    }
}
