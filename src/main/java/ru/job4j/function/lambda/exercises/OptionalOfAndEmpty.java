package ru.job4j.function.lambda.exercises;
import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl = Optional.empty();
        if (strings.contains(value)) {
            rsl = Optional.of(value);
        }
        return rsl;
    }
}