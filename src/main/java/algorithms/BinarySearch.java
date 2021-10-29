package algorithms;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

import java.util.List;
import java.util.Objects;

@Slf4j
public class BinarySearch {
    private static final Logger LOGGER = BinarySearch.log;

    public int find(List<Integer> list, Integer element) {
        LOGGER.info("searching for element: {}", element);

        int lower;
        int upper;
        int middle = list.size() / 2;

        while (true) {
            int middleEl = list.get(middle);
            if (Objects.equals(middleEl, element)) return middle;
            if (middleEl > element) {
                upper = middle;
                lower = 0;
            } else {
                lower = middle;
                upper = list.size() - 1;
            }
            LOGGER.info("=== Upper: {}, Lower: {}, Middle: {} ===", upper, lower, middle);
            middle = (lower + upper) / 2;
            if (upper - lower <= 1) {
                if (Objects.equals(list.get(upper), element)) {
                    return upper;
                } else if (Objects.equals(list.get(lower), element)) {
                    return lower;
                }
                break;
            }
        }
        return -1;
    }
}
