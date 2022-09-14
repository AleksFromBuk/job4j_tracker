package ru.job4j.streamapi.task1;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<>();
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += el;
                tmp.add(start);
                start += "/";
            }
        }
        for (String it : tmp) {
            rsl.add(it);
        }
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
