package algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.singletonList;

public class MostFrequent {
    public List<String> findMostFrequent(List<String> words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (!set.add(word)) {
                return singletonList(word);
            }
        }
        return words;
    }
}
