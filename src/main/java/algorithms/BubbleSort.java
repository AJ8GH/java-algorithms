package algorithms;

import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Integer> sort(List<Integer> input) {
        if (input.size() < 2) return input;

        while (true) {
            int counter = 0;
            for (int i = 0; i < input.size() -1; i++) {
                Integer iInt = input.get(i);
                Integer jInt = input.get(i + 1);
                if (iInt > jInt) {
                    Collections.swap(input, i, i + 1);
                    counter++;
                }
            }
            if (counter == 0) break;
        }
        return input;
    }
}
