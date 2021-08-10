package ru.job4j.ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BackArray {
    public static void solve(int l, int r, ArrayList<Integer> data) {
        if (l == r) {
            System.out.print(data.get(r) + " ");
            return;
        } else if (l < r) {
            int current = l + (r - l) / 2;
            System.out.print(data.get(current) + " ");
            solve(current + 1,  r, data);
            solve(l, current - 1, data);
        }
        return;
    }

    public static void main(String[] args) {
        int n = 0, tmp = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ArrayList<Integer> data = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            data.add(in.nextInt());
        }
        solve(0, n - 1, data);
        in.close();
    }
}
