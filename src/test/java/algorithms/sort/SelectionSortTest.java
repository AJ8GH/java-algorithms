package algorithms.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SelectionSortTest {

  private static Stream<Arguments> argumentProvider() {
    return Stream.of(
        Arguments.of(
            new int[]{1},
            new int[]{1}
        ),
        Arguments.of(
            new int[]{2, 1},
            new int[]{1, 2}
        ),
        Arguments.of(
            new int[]{3, 5, 6, 4, 1, 2},
            new int[]{1, 2, 3, 4, 5, 6}
        ),
        Arguments.of(
            new int[]{7, 5, 9, 3, 8, 1, 6, 4, 2, 10},
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        ),
        Arguments.of(
            new int[]{7, 5, 5, 9, 7, 3, 10, 8, 5, 1, 6, 4, 2, 5, 10},
            new int[]{1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 8, 9, 10, 10}
        ),
        Arguments.of(
            new int[]{7, 11, 5, 13, 9, 12, 19, 15, 17, 3, 8, 1, 16, 6, 20, 4, 2, 18, 14, 10},
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
        )
    );
  }

  @ParameterizedTest
  @MethodSource(value = "argumentProvider")
  void selectionSort(int[] input, int[] expected) {
    var selectionSort = new SelectionSort();
    selectionSort.selectionSort(input);
    assertArrayEquals(expected, input);
  }
}
