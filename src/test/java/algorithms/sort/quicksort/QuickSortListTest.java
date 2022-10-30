package algorithms.sort.quicksort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class QuickSortListTest {

  private static Stream<Arguments> argumentProvider() {
    return Stream.of(
        Arguments.of(
            new ArrayList<>(List.of(1)),
            new ArrayList<>(List.of(1))
        ),
        Arguments.of(
            new ArrayList<>(List.of(2, 1)),
            new ArrayList<>(List.of(1, 2))
        ),
        Arguments.of(
            new ArrayList<>(List.of(3, 5, 6, 4, 1, 2)),
            new ArrayList<>(List.of(1, 2, 3, 4, 5, 6))
        ),
        Arguments.of(
            new ArrayList<>(List.of(7, 5, 9, 3, 8, 1, 6, 4, 2, 10)),
            new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        ),
        Arguments.of(
            new ArrayList<>(List.of(7, 5, 9, 7, 3, 8, 5, 1, 9, 6, 4, 9, 2, 10)),
            new ArrayList<>(List.of(1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 9, 10))
        ),
        Arguments.of(
            new ArrayList<>(
                List.of(7, 11, 5, 13, 9, 12, 19, 15, 17, 3, 8, 1, 16, 6, 20, 4, 2, 18, 14, 10)),
            new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20))
        ),
        Arguments.of(
            new ArrayList<>(List.of("c", "d", "b", "c", "a", "b", "a", "d")),
            new ArrayList<>(List.of("a", "a", "b", "b", "c", "c", "d", "d"))
        )
    );
  }

  @ParameterizedTest
  @MethodSource(value = "argumentProvider")
  <T extends Comparable<T>> void quickSort(List<T> input, List<T> expected) {
    var quick = new QuickSortList();
    quick.quickSort(input);
    assertEquals(expected, input);
  }
}
