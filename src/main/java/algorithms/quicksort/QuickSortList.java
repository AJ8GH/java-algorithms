package algorithms.quicksort;

import java.util.Collections;
import java.util.List;

public class QuickSortList {

  public <T extends Comparable<T>> void quickSort(List<T> input) {
    sort(0, input.size() - 1, input);
  }

  private <T extends Comparable<T>> void sort(int low, int high, List<T> input) {
    if (high - low < 1) {
      return;
    }
    int pivotIndex = partition(low, high, input);
    sort(low, pivotIndex - 1, input);
    sort(pivotIndex, high, input);
  }

  private <T extends Comparable<T>> int partition(int low, int high, List<T> input) {
    T pivot = input.get(low);
    for (int i = low + 1, j = high; i <= j; ) {
      if (i >= j) {
        if (input.get(j).compareTo(pivot) < 0) {
          Collections.swap(input, low, j);
        }
        return j;
      }
      if (input.get(i).compareTo(pivot) < 0) {
        i++;
      } else if (input.get(j).compareTo(pivot) >= 0) {
        j--;
      } else {
        Collections.swap(input, i, j);
      }
    }
    return -1;
  }
}
