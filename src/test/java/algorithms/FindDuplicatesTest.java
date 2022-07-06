package algorithms;

import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindDuplicatesTest {
  private FindDuplicates victim;

  @BeforeEach
  void setUp() {
    victim = new FindDuplicates();
  }

  @ParameterizedTest(name = "{index} => {0}")
  @MethodSource(value = "dataProvider")
  <T> void findDuplicates(String name, List<T> input, Set<T> expected) {
    assertEquals(expected, victim.findDuplicates(input));
  }

  private static Stream<Arguments> dataProvider() {
    return Stream.of(
        Arguments.of(
            "One duplicate",
            List.of(1, 1),
            Set.of(1)
        ),
        Arguments.of(
            "Many duplicates",
            List.of("1", "0", "2", "4", "7", "1", "5", "5"),
            Set.of("1", "5")
        ),
        Arguments.of(
            "No duplicates",
            List.of("1", "0", "2", "4", "7", "3", "5", "9"),
            emptySet()
        )
    );
  }
}
