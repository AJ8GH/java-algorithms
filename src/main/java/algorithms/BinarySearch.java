package algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;

@Slf4j
public class BinarySearch<T extends Comparable<? super T>> {

    public int search(List<T> list, T element) {
        int counter = 0;
        int lower = 0;
        int upper = list.size() - 1;
        int middle = list.size() / 2;

        while (upper - lower > 1) {
            counter++;
            T middleElement = list.get(middle);
            if (Objects.equals(middleElement, element)) return middle;
            if (middleElement.compareTo(element) > 0) upper = middle;
            if (middleElement.compareTo(element) < 0) lower = middle;
            middle = (lower + upper) / 2;
        }
        log.info("Number of searches:  {}", counter);
        if (Objects.equals(list.get(upper), element)) return upper;
        if (Objects.equals(list.get(lower), element)) return lower;
        return -1;
    }
}
