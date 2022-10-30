package algorithms.graph;

public class FindPath {

  public int[] findPath(int[][] input) {

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {
        search(input, i, j);
      }
    }

    return new int[]{};
  }

  private int[] search(int[][] grid, int i, int j) {
    if (grid[i][j] == 1) {
      return new int[] {i, j};
    }

    return new int[]{};
  }
}
