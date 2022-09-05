package ru.job4j.stream.addresslist;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    // Создать класс Profiles, в котором определить метод,
    // который позволит преобразовать список профилей в список адресов.
    // Каркас представлен ниже:

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(task -> task.getAddress())
                .collect(Collectors.toList());
    }
}