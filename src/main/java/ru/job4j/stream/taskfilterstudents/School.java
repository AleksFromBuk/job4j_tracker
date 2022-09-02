package ru.job4j.stream.taskfilterstudents;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .filter(predict)
                .collect(Collectors.toList());
    }
}
