package algorithms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
        List<String> result = victim.findMostFrequent(words);

        assertEquals(words, result);
    }

    @Test
    public void testMostFrequent_FourElementList_ClearWinner() {
        List<String> words = List.of("The", "swift", "fox", "fox");
        List<String> result = victim.findMostFrequent(words);

        List<String> expected = singletonList("fox");
        assertEquals(expected, result);
    }
}
