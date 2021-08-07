package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        StringBuilder leftTmp = new StringBuilder();
        String rightTmp = "";
        int lid = 0;
        int rid = 0;
        char locLeft = 0;
        char locRight = 0;
        int rslFormCompare = 0;

        while(locLeft != ' ' && locRight != ' ' && rslFormCompare == 0) {
            while((locLeft = left.charAt(lid)) != ' ') {
                lid++;
                if (locLeft == '.') {
                    break;
                }
                leftTmp.append(locLeft);
            }
            while((locRight = right.charAt(rid)) != ' ') {
                rid++;
                if (locRight == '.') {
                    break;
                }
                rightTmp += locRight;
            }
            if(leftTmp.length() != rightTmp.length()) {
                return leftTmp.length() - rightTmp.length();
            }
            else {
                rslFormCompare = leftTmp.toString().compareTo(rightTmp);
            }
        }
        if (locLeft == ' ') {
            return 1;
        }
        else if (locRight == ' ') {
            return -1;
        }
        return leftTmp.toString().compareTo(rightTmp);
    }
}

