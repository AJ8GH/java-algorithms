package algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public <T> Set<T> findDuplicates(List<T> input) {
        HashSet<T> set = new HashSet<>();
        HashSet<T> output = new HashSet<>();

        for (T element : input) {
            if (!set.add(element)) {
                output.add(element);
            }
        }
        return output;
    }
}
