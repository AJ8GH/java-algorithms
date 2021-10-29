package algorithms;

import java.util.List;
import java.util.Objects;

public class BinarySearch {
    public int find(List<Integer> list, Integer element) {
        int lower = 0;
        int upper = list.size() - 1;
        int middle = list.size() / 2;

        while (upper - lower > 1) {
            int middleElement = list.get(middle);
            if (Objects.equals(middleElement, element)) return middle;
            if (middleElement > element) upper = middle;
            if (middleElement < element) lower = middle;
            middle = (lower + upper) / 2;
        }
        if (Objects.equals(list.get(upper), element)) return upper;
        if (Objects.equals(list.get(lower), element)) return lower;
        return -1;
    }
}
