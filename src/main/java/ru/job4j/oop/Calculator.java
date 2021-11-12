package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a)
                + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator exmpl = new Calculator();
        System.out.println(sum(4));
        System.out.println(exmpl.multiply(4));
        System.out.println(exmpl.minus(4));
        System.out.println(exmpl.divide(4));
        System.out.println(exmpl.sumAllOperation(4));
    }
}
