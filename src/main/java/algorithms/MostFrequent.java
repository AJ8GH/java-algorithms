package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MostFrequent {
    public Set<String> findMostFrequent(List<String> words) {
        Map<String, Integer> tally = getTally(words);
        Set<String> mostFrequent = new HashSet<>();
        int highest = 1;

        for (Map.Entry<String, Integer> entry : tally.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
                mostFrequent.clear();
                mostFrequent.add(entry.getKey());
            } else if (entry.getValue() == highest) {
                mostFrequent.add(entry.getKey());
            }
        }
        return mostFrequent;
    }

    private Map<String, Integer> getTally(List<String> words) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            Integer tally = count.get(word);
            count.put(word, (tally != null) ? ++tally : 1);
        }
        return count;
    }
}
