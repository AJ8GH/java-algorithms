package algorithms.sort;

public class SelectionSort {

  public void selectionSort(int[] input) {
    int maxValue = Integer.MIN_VALUE;
    int maxValueIndex = -1;

    for (int i = input.length - 1; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        if (input[j] > maxValue) {
          maxValue = input[j];
          maxValueIndex = j;
        }
      }
      if (maxValueIndex >= 0) {
        int tmp = input[i];
        input[i] = maxValue;
        input[maxValueIndex] = tmp;
        maxValue = Integer.MIN_VALUE;
      }
    }
  }
}
