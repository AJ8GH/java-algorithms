package algorithms;

import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Integer> sort(List<Integer> input) {
        while (true) {
            int counter = 0;
            for (int i = 0; i < input.size() -1; i++) {
                if (input.get(i) > input.get(i + 1)) {
                    Collections.swap(input, i, i + 1);
                    counter++;
                }
            }
            if (counter == 0) return input;
        }
    }
}
