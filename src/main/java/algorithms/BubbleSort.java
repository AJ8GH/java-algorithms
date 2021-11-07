package algorithms;

import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Integer> sort(List<Integer> input) {
        for (int i = 0; i < input.size() -1; i++) {
            if (input.get(i) > input.get(i + 1)) {
                Collections.swap(input, i, i + 1);
            }
            for (int j = input.size() -1; j >= 1; j--) {
                if (input.get(j) < input.get(j - 1)) {
                    Collections.swap(input, j, j - 1);
                }
            }
        }
        return input;
    }
}
