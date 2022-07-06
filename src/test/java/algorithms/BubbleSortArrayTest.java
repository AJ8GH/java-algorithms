package algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BubbleSortArrayTest {
  private BubbleSortArray<Integer> victim;

  @BeforeEach
  void setUp() {
    victim = new BubbleSortArray<>();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void sort(String name, Integer[] expected, Integer[] input) {
    assertArrayEquals(expected, victim.sort(input));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("Empty list", new Integer[] {}, new Integer[] {}),
        Arguments.of("Singleton list", new Integer[] { 1 }, new Integer[] { 1 }),
        Arguments.of("Two element list", new Integer[] { 1, 2 }, new Integer[] { 2, 1 }),
        Arguments.of("Three element list", new Integer[] { 1, 2, 3 }, new Integer[] { 3, 1, 2 }),
        Arguments.of(
            "Five element list",
            new Integer[] { 1, 2, 3, 4, 5 },
            new Integer[] { 5, 3, 1, 4, 2 }
        ),
        Arguments.of(
            "Ten element list",
            new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
            new Integer[] { 7, 5, 9, 3, 8, 1, 6, 4, 2, 10 }
        ),
        Arguments.of(
            "Twenty element list",
            new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
            new Integer[] { 7, 11, 5, 13, 9, 12, 19, 15, 17, 3, 8, 1, 16, 6, 20, 4, 2, 18, 14, 10 }
        )
    );
  }
}
