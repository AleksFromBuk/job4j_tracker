package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] first = left.split("\\. ");
        String[] second = right.split("\\. ");
        String[] a = first[0].split("\\.");
        String[] b = second[0].split("\\.");
        for(int i = 0; i < Math.min(a.length, b.length); i++) {
            if(Integer.parseInt(a[i]) != Integer.parseInt(b[i])) {
                return Integer.compare(Integer.parseInt(a[i]), Integer.parseInt(b[i]));
            }
        }
        return a.length - b.length;
    }
}