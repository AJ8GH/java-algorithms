package algorithms;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shuffle {
  private final Random random;

  public Shuffle(Random random) {
    this.random = random;
  }

  public <T> List<T> shuffle(List<T> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int j = random.nextInt(list.size());
      Collections.swap(list, i, j);
    }
    return list;
  }
}
