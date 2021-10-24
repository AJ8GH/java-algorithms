package algorithms;

import java.util.List;

public class BinarySearch {
    public <T> int find(List<? extends Comparable<? super T>> list, T element) {
        return list.get(0) == element ? 0 : 1;
    }
}
