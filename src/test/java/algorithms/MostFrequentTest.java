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
        List<String> words = singletonList("the");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("the");
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

    @Test
    public void testMostFrequent_ThreeElementTie() {
        List<String> words = List.of("a", "a", "a", "b", "b", "b", "c", "c", "c");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("a", "b", "c");
        assertEquals(expected, result);
    }

    @Test
    public void testMostFrequent_AllSingleElements() {
        List<String> words = List.of("The", "swift", "fox", "jumped", "over");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("the", "swift", "fox", "jumped", "over");
        assertEquals(expected, result);
    }

    @Test
    public void testMostFrequent_CaseInsensitive() {
        List<String> words = List.of("The", "the", "fox", "FOX", "fOX");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("fox");
        assertEquals(expected, result);
    }

    @Test
    public void testMostFrequent_IgnorePunctuation() {
        List<String> words = List.of("The", "the", "fox...", "FOX!", "fOX:");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("fox");
        assertEquals(expected, result);
    }

    @Test
    public void testMostFrequent_DoesNotIgnoreHyphensAndApostrophes() {
        List<String> words = List.of("can't", "won't", "long-term", "high-tech");
        Set<String> result = victim.findMostFrequent(words);

        Set<String> expected = Set.of("can't", "won't", "long-term", "high-tech");
        assertEquals(expected, result);
    }
}
