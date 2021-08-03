package ru.job4j.collection;

import java.util.*;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int lSize = left.length();
        int rSize = right.length();
        for (int i = 0; i < Math.min(lSize, rSize); i++) {
            int locrsl = Character.compare(left.charAt(i), right.charAt(i));
            if (locrsl != 0) {
                return locrsl > 0 ? 1 : -1;
            }
        }
        return lSize - rSize;
    }
}
