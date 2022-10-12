package algorithms.quicksort;

public class QuickSortInt {

  public void quickSort(int[] input) {
    sort(0, input.length - 1, input);
  }

  private void sort(int start, int end, int[] input) {
    if (end - start < 1) {
      return;
    }

    int pivotIndex = partition(start, end, input);
    sort(start, pivotIndex - 1, input);
    sort(pivotIndex, end, input);
  }

  private int partition(int pivotIndex, int end, int[] input) {
    int pivot = input[pivotIndex];

    for (int i = pivotIndex + 1, j = end; i <= j; ) {
      if (i >= j) {
        if (input[j] < pivot) {
          swap(input, pivotIndex, j);
        }
        return j;
      } else if (input[j] >= pivot) {
        j--;
      } else if (input[i] < pivot) {
        i++;
      } else {
        swap(input, i, j);
      }
    }
    return -1;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
