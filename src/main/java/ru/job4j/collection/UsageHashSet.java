package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMV");
        autos.add("Volvo");
        autos.add("Toyota");

        for (String it : autos) {
            System.out.println(it);
        }
    }
}
