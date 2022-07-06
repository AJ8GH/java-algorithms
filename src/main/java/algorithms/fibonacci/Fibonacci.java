package algorithms.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci extends AbstractFibonacci {
  public List<Integer> getSequence(int n) {
    List<Integer> sequence = new ArrayList<>(FIBONACCI_STARTER);
    if (n < 3) {
      return sequence.subList(0, n);
    }
    for (int i = 0; i < n - 2; i++) {
      sequence.add(sequence.get(i) + sequence.get(i + 1));
    }
    return sequence;
  }
}
