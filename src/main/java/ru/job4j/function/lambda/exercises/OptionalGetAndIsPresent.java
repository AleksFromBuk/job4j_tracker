package ru.job4j.function.lambda.exercises;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> ans = indexOf(data, el);
        return ans.isEmpty() ? -1 : ans.get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> res = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                res = Optional.of(i);
                break;
            }
        }
        return res;
    }
}