package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public String count(String inputString) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            Integer tally = count.getOrDefault(currentChar, 0);
            count.put(currentChar, ++tally);
        }

        String outputString = count.toString();
        return outputString.substring(1, outputString.length() - 1);
    }
}
