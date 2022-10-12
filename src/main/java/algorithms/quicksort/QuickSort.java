package algorithms.quicksort;

public class QuickSort {

  public <T extends Comparable<T>> void quickSort(T[] input) {
    sort(0, input.length - 1, input);
  }

  private <T extends Comparable<T>> void sort(int start, int end, T[] input) {
    if (end - start < 1) {
      return;
    }

    int pivotIndex = partition(start, end, input);
    sort(start, pivotIndex - 1, input);
    sort(pivotIndex, end, input);
  }

  private <T extends Comparable<T>> int partition(int pivotIndex, int end, T[] input) {
    T pivot = input[pivotIndex];

    for (int i = pivotIndex + 1, j = end; i <= j; ) {
      if (i >= j) {
        if (input[j].compareTo(pivot) < 0) {
          swap(input, pivotIndex, j);
        }
        return j;
      } else if (input[j].compareTo(pivot) >= 0) {
        j--;
      } else if (input[i].compareTo(pivot) < 0) {
        i++;
      } else {
        swap(input, i, j);
      }
    }
    return -1;
  }

  private <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
