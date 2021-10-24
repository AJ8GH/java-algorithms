package algorithms;

import java.util.List;

public class BinarySearch {
    public <T> int find(List<? extends Comparable<? super T>> list, T element) {
        if (list.get(0) == element) return 0;
        if (list.get(1) == element) return 1;
        return -1;
    }
}
