package algorithms;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursive extends AbstractFibonacci {
    public List<Integer> getSequence(int n) {
        if (n < 2) return FIBONACCI_STARTER.subList(0, n);
        return getSequence(n, new ArrayList<>(FIBONACCI_STARTER));
    }

    public List<Integer> getSequence(int n, List<Integer> sequence) {
        if (n < 3) return sequence;
        sequence.add(sequence.get(n - 3) + sequence.get(n - 2));
        return getSequence(n - 1, sequence);
    }
}
