package algorithms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Collections.singletonList;
import static org.testng.AssertJUnit.assertEquals;

public class ShuffleTest {
    private static Shuffle victim;
    private List<Integer> list;
    private List<Integer> expected;
    private Random random;

    @BeforeMethod
    public void setup() {
        random = new Random();
        victim = new Shuffle(random);
    }

    @Test
    public void testShuffle_OneElementList() {
        list = singletonList(1);
        random.setSeed(1L);

        victim.shuffle(list);

        assertEquals(Integer.valueOf(1), list.get(0));
    }

    @Test
    public void testShuffle_TwoElementList() {
        list = Arrays.asList(1, 2);
        random.setSeed(1L);

        victim.shuffle(list);

        expected = List.of(2, 1);

        assertEquals(expected, list);
    }
}
