package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book ob1 = new Book("Clean Code", 462);
        Book ob2 = new Book("NiklausVirt - Алгоритмы и структуры данных", 358);
        Book ob3 = new Book("Р.Седжвик - Алгоритмы на Java", 843);
        Book ob4 = new Book("Straustrup - ExtraQBasic", 1000);

        Book[] data = new Book[4];
        data[0] = ob1;
        data[1] = ob2;
        data[2] = ob3;
        data[3] = ob4;
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getName() + '\t' + data[i].getCount());
        }
        data[0] = ob4;
        data[3] = ob1;
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getName() + '\t' + data[i].getCount());
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            if(data[i].getName().equals("Clean Code")) {
                System.out.println(data[i].getName() + '\t' + data[i].getCount());
            }
        }
        System.out.println();
    }
}