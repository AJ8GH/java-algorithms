package algorithms.fibonacci;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FibonacciTest {
  private Fibonacci victim;

  @BeforeEach
  void setUp() {
    victim = new Fibonacci();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  void testGetSequence_oneNumber(String name, List<Integer> expected, int n) {
    assertEquals(expected, victim.getSequence(n));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of("One number", singletonList(0), 1),
        Arguments.of("Two numbers", List.of(0, 1), 2),
        Arguments.of("Zero numbers", emptyList(), 0),
        Arguments.of("Three numbers", List.of(0, 1, 1), 3),
        Arguments.of("Four numbers", List.of(0, 1, 1, 2), 4),
        Arguments.of("Ten numbers", List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), 10)
    );
  }
}
