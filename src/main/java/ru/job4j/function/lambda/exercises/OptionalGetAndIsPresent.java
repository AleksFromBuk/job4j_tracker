package ru.job4j.function.lambda.exercises;

import java.util.Optional;
/**
  Для того, чтобы проверить, что в Optional есть значение или нет, можно использовать
 метод isPresent(), isEmpty().

 Например, Optional.of(1).isPresent(); // даст true
 Optional.empty().isEmpty(); // даст true
 Для получения значения, которое мы поместили с помощью метода of() мы можем
 использовать метод get().

 Например, Optional.of(1).get() // Вернет 1
 Optilnal.empty().get() // Вернет исключение!
 Запомните, перед вызовом метода get() всегда нужно использовать isPresent().
 В этом суть Optional, чтобы программист не забывал делать проверки.

 Ваша задача:
 1. Написать метод indexOf(). Он ищет индекс по значению. Если индекс не найден,
 должно вернуться Optional.empty(). Если найден, то Optional из этого индекса
 2. В методе get() нужно вызвать метод indexOf(). Если вернулся пустой Optinal,
 то метод должен вернуть -1, в противном случае сам индекс
*/
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