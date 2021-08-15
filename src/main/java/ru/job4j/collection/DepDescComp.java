package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        StringCompare obj = new StringCompare();
        if (obj.compare(o1.split("/")[0], o2.split("/")[0]) == 0) {
            return o1.compareTo(o2);
        } else {
            return o2.compareTo(o1);
        }
    }

}


