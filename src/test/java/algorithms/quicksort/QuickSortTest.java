package algorithms.quicksort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class QuickSortTest {

  private static Stream<Arguments> argumentProvider() {
    return Stream.of(
        Arguments.of(
            new Integer[]{1},
            new Integer[]{1}
        ),
        Arguments.of(
            new Integer[]{2, 1},
            new Integer[]{1, 2}
        ),
        Arguments.of(
            new Integer[]{5, 9, 4, 6, 5, 3},
            new Integer[]{3, 4, 5, 5, 6, 9}
        ),
        Arguments.of(
            new Integer[]{3, 5, 6, 4, 1, 2},
            new Integer[]{1, 2, 3, 4, 5, 6}
        ),
        Arguments.of(
            new Integer[]{7, 5, 9, 3, 8, 1, 6, 4, 2, 10},
            new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        ),
        Arguments.of(
            new Integer[]{7, 5, 9, 7, 3, 8, 5, 1, 9, 6, 4, 9, 2, 10},
            new Integer[]{1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 9, 10}
        ),
        Arguments.of(
            new Integer[]{7, 11, 5, 13, 9, 12, 19, 15, 17, 3, 8, 1, 16, 6, 20, 4, 2, 18, 14, 10},
            new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
        ),
        Arguments.of(
            new String[]{"c", "d", "b", "c", "a", "b", "a", "d"},
            new String[]{"a", "a", "b", "b", "c", "c", "d", "d"}
        )
    );
  }

  @ParameterizedTest
  @MethodSource(value = "argumentProvider")
  <T extends Comparable<T>> void quickSort(T[] input, T[] expected) {
    var quick = new QuickSort();
    quick.quickSort(input);
    assertArrayEquals(expected, input);
  }
}
