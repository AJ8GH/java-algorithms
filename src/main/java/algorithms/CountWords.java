package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
  public String count(String inputString) {
    Map<String, Integer> count = new HashMap<>();
    for (String word : inputString.split(" ")) {
      word = normalize(word);
      Integer tally = count.get(word);
      count.put(word, (tally != null) ? ++tally : 1);
    }
    return count.toString();
  }

  private String normalize(String word) {
    return word.toLowerCase().replaceAll("[^a-zA-Z'-]", "");
  }
}
