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

class ReverseListTest {
  private Reverse victim;

  @BeforeEach
  void setUp() {
    victim = new Reverse();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void reverse(String name, List<Integer> expected, List<Integer> actual) {
    assertEquals(expected, victim.reverse(actual));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("Empty list", emptyList(), emptyList()),
        Arguments.of("Singleton list", singletonList(1), singletonList(1)),
        Arguments.of("Two element list", List.of(2, 1), Arrays.asList(1, 2)),
        Arguments.of("Three element list", List.of(3, 2, 1), Arrays.asList(1, 2, 3)),
        Arguments.of("Four element list", List.of(4, 3, 2, 1), Arrays.asList(1, 2, 3, 4)),
        Arguments.of("Five element list", List.of(5, 4, 3, 2, 1), Arrays.asList(1, 2, 3, 4, 5)),
        Arguments.of(
            "Twelve element list",
            List.of(12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1),
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        ),
        Arguments.of(
            "Fifteen element list",
            List.of(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1),
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        )
    );
  }
}
