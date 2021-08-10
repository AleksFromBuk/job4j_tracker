package ru.job4j.collection;

import java.util.Comparator;

public class LexSortBrutFore implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        StringBuilder leftTmp = new StringBuilder();
        StringBuilder rightTmp = new StringBuilder();
        int lid = 0;
        int rid = 0;
        char locLeft = 0;
        char locRight = 0;
        int rslFromCompare = 0;

        while (locLeft != ' ' && locRight != ' ' && rslFromCompare == 0) {
            while ((locLeft = left.charAt(lid)) != ' ') {
                lid++;
                if (locLeft == '.') {
                    break;
                }
                leftTmp.append(locLeft);
            }
            while ((locRight = right.charAt(rid)) != ' ') {
                rid++;
                if (locRight == '.') {
                    break;
                }
                rightTmp.append(locRight);
            }
            if (leftTmp.length() != rightTmp.length()) {
                return leftTmp.length() - rightTmp.length();
            } else {
                rslFromCompare = leftTmp.toString().compareTo(rightTmp.toString());
            }
        }
        if (locLeft == ' ') {
            return 1;
        } else if (locRight == ' ') {
            return -1;
        }
        return leftTmp.toString().compareTo(rightTmp.toString());
    }
}

