package ru.job4j.function.lambda.exercises;

import java.util.Optional;
public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
//        Optional<Integer> ans = max(data);
//        if (!ans.isEmpty()) {
//            System.out.println("Max: " + ans.get());
//        } else {
//            ans.empty().ifPresent(System.out::println);
//        }
        max(data).ifPresent(integer -> System.out.println("Max: " + integer));
    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> rsl = Optional.empty();
        if (data.length != 0) {
            int ma = 0;
            for (int datum : data) {
                if (datum > ma) {
                    ma = datum;
                }
            }
            rsl = Optional.of(ma);
        }
        return rsl;
    }

    public static void main(String[] args) {
        OptionalIfPresent.ifPresent(new int[] {1, 2, 3});
        OptionalIfPresent.ifPresent(new int[] {});
    }
}