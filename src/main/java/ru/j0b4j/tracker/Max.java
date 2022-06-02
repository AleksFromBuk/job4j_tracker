package ru.j0b4j.tracker;

public class Max {

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(a, max(c, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(b, c, d));
    }

    public static int max(int...v) {
        if (v.length == 0) {
            System.out.println("array is empty");
            return -1;
        } else {
            int ans = v[0];
            for (int i = 1; i < v.length; i++) {
                if (ans < v[i]) {
                    ans = v[i];
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; ; i++) {
            System.out.println(i);
        }
    }
}