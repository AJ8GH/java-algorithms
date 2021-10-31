package algorithms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static org.testng.AssertJUnit.assertEquals;

public class FindDuplicatesTest {
    private static FindDuplicates victim;

    @BeforeClass
    public static void setUp() {
        victim = new FindDuplicates();
    }

    @Test
    public void findDuplicates_emptyList() {
        List<Integer> input = emptyList();
        assertEquals(emptySet(), victim.findDuplicates(input));
    }

    @Test
    public void findDuplicates_oneDuplicate() {
        List<Integer> input = List.of(1, 1);
        assertEquals(Set.of(1), victim.findDuplicates(input));
    }

    @Test
    public void findDuplicates_manyDuplicates() {
        List<String> input = List.of("1", "0", "2", "4", "7", "1", "5", "5");
        assertEquals(Set.of("1", "5"), victim.findDuplicates(input));
    }

    @Test
    public void findDuplicates_noDuplicates() {
        List<String> input = List.of("1", "0", "2", "4", "7", "3", "5", "9");
        assertEquals(emptySet(), victim.findDuplicates(input));
    }
}
