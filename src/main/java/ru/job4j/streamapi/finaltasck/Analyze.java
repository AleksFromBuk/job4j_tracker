package ru.job4j.streamapi.finaltasck;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.
                flatMapToInt(s -> s.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore))
                        .average().orElse(0D);

    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
          return stream.
                  map(s -> new Tuple(s.getName(), s.getSubjects()
                          .stream()
                          .mapToInt(Subject::getScore)
                          .average().orElse(0D)))
                  .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.
                flatMap(s -> s.getSubjects()
                        .stream())
                        .collect(Collectors.groupingBy(Subject::getName,
                                LinkedHashMap::new,
                                Collectors.averagingDouble(Subject::getScore)))
                        .entrySet()
                        .stream()
                        .map(o -> new Tuple(o.getKey(), o.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(s -> new Tuple(s.getName(), s.getSubjects()
                        .stream()
                        .mapToDouble(Subject::getScore)
                        .sum()))
                .max(Comparator.comparingDouble(Tuple::getScore)).orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(s -> s.getSubjects()
                        .stream())
                        .collect(Collectors.groupingBy(Subject::getName,
                                Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(o -> new Tuple(o.getKey(), o.getValue()))
                .max(Comparator.comparingDouble(Tuple::getScore)).orElse(null);
    }
}