package algorithms;

import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size() -1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                swap(list, i, j);
            }
        }
        return list;
    }

    private void swap(List<Integer> list, int i, int j) {
        if (list.get(i) > list.get(j)) {
            Collections.swap(list, i, j);
        }
    }
}
