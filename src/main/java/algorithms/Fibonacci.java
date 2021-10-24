package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    public List<Integer> getSequence(int n) {

        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        if (n < 3) return fibonacciSequence.subList(0, n);
        fibonacciSequence.add(1);
        return fibonacciSequence;
    }
}
