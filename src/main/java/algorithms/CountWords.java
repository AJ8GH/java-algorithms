package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public String count(String inputString) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : inputString.split(" ")) {
            Integer number = count.get(word);
            count.put(word, (number != null) ? ++number : 1);
        }
        return count.toString();
    }
}
