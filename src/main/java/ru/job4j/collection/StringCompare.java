package ru.job4j.collection;

import java.util.*;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            int locrsl = Character.compare(left.charAt(i), right.charAt(i));
            if (locrsl != 0) {
                return locrsl;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
