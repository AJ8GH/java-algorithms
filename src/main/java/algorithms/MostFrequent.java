package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MostFrequent {
    public Set<String> findMostFrequent(List<String> words) {
        Map<String, Integer> tally = new HashMap<>();
        for (String word : words) {
            if (tally.containsKey(word)) {
                tally.replace(word, tally.get(word) + 1);
            } else {
                tally.put(word, 1);
            }
        }
        int highest = 1;
        Set<String> mostFrequent = new HashSet<>();
        for (Map.Entry<String, Integer> entry : tally.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();

            if (count > highest) {
                highest = count;
                mostFrequent.clear();
                mostFrequent.add(word);
            } else if (count == highest && highest > 1) {
                mostFrequent.add(word);
            }
        }
        if (mostFrequent.isEmpty()) mostFrequent.addAll(words);
        return mostFrequent;
    }
}
