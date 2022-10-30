package algorithms.graph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Disabled
class FindPathTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {{0, 0}, {0, 1}},
            new int[]{1, 1})
    );
  }

  @ParameterizedTest
  @MethodSource(value = "inputProvider")
  void findPath(int[][] grid, int[] expected) {
    var findPath = new FindPath();
    var actual = findPath.findPath(grid);
    assertArrayEquals(expected, actual);
  }
}
