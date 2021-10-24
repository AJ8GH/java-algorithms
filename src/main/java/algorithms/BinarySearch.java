package algorithms;

import java.util.List;

public class BinarySearch {
    public int find(List<Integer> list, Integer element) {
        int lower = 0;
        int upper = list.size() - 1;
        Integer lowerElement = list.get(lower);
        Integer upperElement = list.get(upper);

        if (lowerElement.equals(element)) return lower;
        if (upperElement.equals(element)) return upper;
        return -1;
    }
}
