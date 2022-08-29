package ru.job4j.function.lambda.exercises;
import java.util.List;
import java.util.Optional;

/**
В Optional есть два метода of() и empty(), первый принимает значение и
 возвращает Optional из этого значения. Второй возвращает пустой Optional,
 что значит значения в нем нет.
 Например,
        Optional<Integer> num1 = Optional.of(1);      // внутри храниться значение 1
        Optional<Integer> num2 = Optional.empty(); // внутри ничего не храниться

 Ваша задача написать метод поиска строки среди списка строк.
 Если значение найдено, то нужно вернуть Optional из этого значения,
 в противном случае вернуть пустой Optional.
*/

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl = Optional.empty();
        if (strings.contains(value)) {
            rsl = Optional.of(value);
        }
        return rsl;
    }
}