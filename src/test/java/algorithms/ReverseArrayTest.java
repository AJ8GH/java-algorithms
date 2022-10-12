package algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseArrayTest {

  private static Reverse victim;

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("Empty array", new Integer[]{}, new Integer[]{}),
        Arguments.of("Singleton array", new Integer[]{1}, new Integer[]{1}),
        Arguments.of("Two element array", new Integer[]{2, 1}, new Integer[]{1, 2}),
        Arguments.of("Three element array", new Integer[]{3, 2, 1}, new Integer[]{1, 2, 3}),
        Arguments.of(
            "Four element array",
            new Integer[]{4, 3, 2, 1},
            new Integer[]{1, 2, 3, 4}
        ),
        Arguments.of(
            "Five element array",
            new Integer[]{5, 4, 3, 2, 1},
            new Integer[]{1, 2, 3, 4, 5}
        ),
        Arguments.of(
            "Twelve element array",
            new Integer[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
            new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
        ),
        Arguments.of(
            "Fifteen element array",
            new Integer[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
            new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}
        )
    );
  }

  @BeforeEach
  void setUp() {
    victim = new Reverse();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void reverse(String name, Integer[] expected, Integer[] actual) {
    assertArrayEquals(expected, victim.reverse(actual));
  }
}
