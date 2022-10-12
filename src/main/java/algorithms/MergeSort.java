package algorithms;

import java.util.Arrays;

public class MergeSort {

  public int[] mergeSort(int[] input) {
    if (input.length < 2) {
      return input;
    } else {
      var solution1 = mergeSort(Arrays.copyOfRange(input, 0, input.length / 2));
      var solution2 = mergeSort(Arrays.copyOfRange(input, input.length / 2, input.length));
      return merge(solution1, solution2);
    }
  }

  private int[] merge(int[] arr1, int[] arr2) {
    var solution = new int[arr1.length + arr2.length];

    for (int i = 0, j = 0; i < arr1.length || j < arr2.length;) {
      if (i >= arr1.length) {
        solution[i + j] = arr2[j++];
      } else if (j >= arr2.length) {
        solution[i + j] = arr1[i++];
      } else {
        solution[i + j] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
      }
    }

    return solution;
  }
}
