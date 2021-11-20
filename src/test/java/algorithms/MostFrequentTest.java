package algorithms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static java.util.Collections.singletonList;
import static org.testng.AssertJUnit.assertEquals;

public class MostFrequentTest {
    private MostFrequent victim;

    @BeforeMethod
    public void setUp() {
        victim = new MostFrequent();
    }

    @Test
    public void testMostFrequent_OneElementList() {
        List<String> words = singletonList("The");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("The");
        assertEquals(expected, result);
    }

    @Test
    public void testMostFrequent_TwoElementWinner() {
        List<String> words = List.of("The", "swift", "fox", "fox");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("fox");
        assertEquals(expected, result);
    }

    @Test
    public void testMostFrequent_ThreeElementWinner() {
        List<String> words = List.of("The", "swift", "fox", "fox", "jumped", "jumped", "jumped");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("jumped");
        assertEquals(expected, result);
    }

    @Test
    public void testMostFrequent_TwoElementTie() {
        List<String> words = List.of("The", "swift", "swift", "fox", "fox", "jumped");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("swift", "fox");
        assertEquals(expected, result);
    }
}
