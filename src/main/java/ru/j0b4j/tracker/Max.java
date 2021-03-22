package ru.j0b4j.tracker;

public class Max {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(a, max(c, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(b, c, d));
    }

    public static void main(String[] args) {
        System.out.println(max(3, 4, 1, 2));
    }
}