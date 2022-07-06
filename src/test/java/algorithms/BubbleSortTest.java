package algorithms;


import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BubbleSortTest {
  private BubbleSort<Integer> victim;

  @BeforeEach
  void setUp() {
    victim = new BubbleSort<>();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void sort(String name, List<Integer> expected, List<Integer> input) {
    assertEquals(expected, victim.sort(input));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("Empty list", emptyList(), emptyList()),
        Arguments.of("Singleton list", singletonList(1), singletonList(1)),
        Arguments.of("Two element list", List.of(1, 2), Arrays.asList(2, 1)),
        Arguments.of("Three element list", List.of(1, 2, 3), Arrays.asList(3, 1, 2)),
        Arguments.of("Five element list", List.of(1, 2, 3, 4, 5), Arrays.asList(5, 3, 1, 4, 2)),
        Arguments.of(
            "Ten element list",
            List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
            Arrays.asList(7, 5, 9, 3, 8, 1, 6, 4, 2, 10)
        ),
        Arguments.of(
            "Twenty element list",
            List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20),
            Arrays.asList(7, 11, 5, 13, 9, 12, 19, 15, 17, 3, 8, 1, 16, 6, 20, 4, 2, 18, 14, 10)
        )
    );
  }
}
