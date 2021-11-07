package algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;

@Slf4j
public class BinarySearch {

    public int search(List<Integer> list, Integer element) {
        int counter = 0;
        int lower = 0;
        int upper = list.size() - 1;
        int middle = list.size() / 2;

        while (upper - lower > 1) {
            counter++;
            Integer middleElement = list.get(middle);
            if (Objects.equals(middleElement, element)) return middle;
            if (middleElement > element) upper = middle;
            if (middleElement < element) lower = middle;
            middle = (lower + upper) / 2;
        }
        log.info("Number of searches:  {}", counter);
        if (Objects.equals(list.get(upper), element)) return upper;
        if (Objects.equals(list.get(lower), element)) return lower;
        return -1;
    }
}
