package algorithms;

import java.util.Collections;
import java.util.List;

public class BubbleSort<T extends Comparable<? super T>> {
    public List<T> sort(List<T> list) {
        for (int i = 0; i < list.size() -1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                swap(list, i, j);
            }
        }
        return list;
    }

    private void swap(List<T> list, int i, int j) {
        if (list.get(i).compareTo(list.get(j)) > 0) {
            Collections.swap(list, i, j);
        }
    }
}
