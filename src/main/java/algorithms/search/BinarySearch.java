package algorithms.search;

import java.util.List;
import java.util.Objects;

public class BinarySearch<T extends Comparable<? super T>> {

  public int search(List<T> list, T element) {
    int lower = 0;
    int upper = list.size() - 1;
    int middle = list.size() / 2;

    while (upper - lower > 1) {
      T middleElement = list.get(middle);
      if (Objects.equals(middleElement, element)) {
        return middle;
      }
      if (middleElement.compareTo(element) > 0) {
        upper = middle;
      }
      if (middleElement.compareTo(element) < 0) {
        lower = middle;
      }
      middle = (lower + upper) / 2;
    }
    if (Objects.equals(list.get(upper), element)) {
      return upper;
    }
    if (Objects.equals(list.get(lower), element)) {
      return lower;
    }
    return -1;
  }
}
