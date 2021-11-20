package algorithms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CountWordsTest {
    private CountWords victim;

    @BeforeMethod
    public void setup() {
        victim = new CountWords();
    }

    @Test
    public void testCount_OneWordString() {
        String inputString = "The";
        String expected = "{The=1}";

        assertEquals(expected, victim.count(inputString));
    }

    @Test
    public void testCount_TwoWordString() {
        String inputString = "The swift";
        String expected = "{The=1, swift=1}";

        assertEquals(expected, victim.count(inputString));
    }

    @Test
    public void testCount_WordStringWithDuplicates() {
        String inputString = "hello bye bye";
        String expected = "{hello=1, bye=2}";

        assertEquals(expected, victim.count(inputString));
    }

    @Test
    public void testCount_WordStringWithPunctuation() {
        String inputString = "hello bye bye,";
        String expected = "{hello=1, bye=2}";

        assertEquals(expected, victim.count(inputString));
    }

    @Test
    public void testCount_WordWithApostrophe() {
        String inputString = "don't, can't, don't";
        String expected = "{don't=2, can't=1}";

        assertEquals(expected, victim.count(inputString));
    }

    @Test
    public void testCount_HyphenatedWord() {
        String inputString = "long-term, long-term, high-tech";
        String expected = "{high-tech=1, long-term=2}";

        assertEquals(expected, victim.count(inputString));
    }
}
