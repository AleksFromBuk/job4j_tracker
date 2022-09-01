package ru.job4j.function.lambda.exercises;

import java.util.function.Supplier;
public class MRSupplier {
    public static Supplier<String> supplier() {
        return String::new;
    }
}