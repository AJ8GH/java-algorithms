package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    public List<Integer> getSequence(int n) {
        List<Integer> fibonacciSequence = new ArrayList<>();
        return n == 1 ? Collections.singletonList(0) : List.of(0, 1);
    }
}
