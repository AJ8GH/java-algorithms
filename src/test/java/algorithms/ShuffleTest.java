package algorithms;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShuffleTest {
  private Shuffle victim;
  private Random random;

  @BeforeEach
  void setup() {
    random = new Random();
    victim = new Shuffle(random);
  }

  @Test
  void testShuffle_OneElementList() {
    var list = singletonList(1);
    random.setSeed(1L);

    victim.shuffle(list);

    assertEquals(Integer.valueOf(1), list.get(0));
  }

  @Test
  void testShuffle_TwoElementList() {
    var list = Arrays.asList(1, 2);
    random.setSeed(1L);

    victim.shuffle(list);

    var expected = List.of(2, 1);
    assertEquals(expected, list);
  }

  @Test
  void testShuffle_SixElementList() {
    var list = Arrays.asList(1, 2, 3, 4, 5, 6);
    random.setSeed(1L);

    victim.shuffle(list);

    var expected = List.of(4, 3, 2, 1, 5, 6);
    assertEquals(expected, list);
  }
}
