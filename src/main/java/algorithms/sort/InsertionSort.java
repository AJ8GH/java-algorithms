package algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

  public int[] insertionSort(int[] input) {
    int[] output = new int[input.length];
    Arrays.fill(output, Integer.MAX_VALUE);

    for (int k : input) {
      for (int i = 0; i < output.length; i++) {
        if (k < output[i]) {
          int temp = output[i];
          output[i] = k;

          while (++i < output.length) {
            int newTemp = output[i];
            output[i] = temp;
            temp = newTemp;
          }
        }
      }
    }
    return output;
  }
}
