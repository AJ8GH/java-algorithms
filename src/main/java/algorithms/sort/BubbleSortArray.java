package algorithms.sort;

public class BubbleSortArray<T extends Comparable<? super T>> {

  public T[] sort(T[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i].compareTo(array[j]) > 0) {
          swap(array, i, j);
        }
      }
    }
    return array;
  }

  private void swap(T[] array, int i, int j) {
    T element = array[i];
    array[i] = array[j];
    array[j] = element;
  }
}
