package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (String val: names) {
            System.out.println(val);
        }

        System.out.println((7 + 3 - 1) / 3);
        System.out.println((5 + 5 - 1) / 5);

    }
}
