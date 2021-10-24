package algorithms.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursive extends AbstractFibonacci {
    public List<Integer> getSequence(int n) {
        if (n < 2) return FIBONACCI_STARTER.subList(0, n);
        return getSequence(n, new ArrayList<>(FIBONACCI_STARTER));
    }

    private List<Integer> getSequence(int n, List<Integer> sequence) {
        if (n < 3) return sequence;
        int size = sequence.size();
        sequence.add(sequence.get(size - 2) + sequence.get(size - 1));
        return getSequence(n - 1, sequence);
    }
}
