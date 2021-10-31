package algorithms;

import java.util.Collections;
import java.util.List;

public class Reverse {
    public <T> List<T> reverse(List<T> list) {
        if (list.size() < 2) return list;
        int j = list.size() - 1;

        for (int i = 0; i < list.size() / 2; i++) {
            Collections.swap(list, i, j--);
        }

        return list;
    }

    public int[] reverse(int[] array) {
        return array;
    }
}
