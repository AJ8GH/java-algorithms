package algorithms;

import java.util.Collections;
import java.util.List;

public class Reverse {
    public <T> List<T> reverse(List<T> list) {
        if (list.size() < 2) return list;

        Collections.swap(list, 0, 1);
        return list;
    }
}
