package algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.singletonList;

public class MostFrequent {
    public List<String> findMostFrequent(List<String> words) {
        Map<String, Integer> tally = new HashMap<>();
        for (String word : words) {
            if (tally.containsKey(word)) {
                tally.replace(word, tally.get(word) + 1);
            } else {
                tally.put(word, 1);
            }
        }
        int highest = 1;
        String mostFrequent = null;
        for (Map.Entry<String, Integer> entry : tally.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent != null ?
                singletonList(mostFrequent) :
                words;
    }
}
