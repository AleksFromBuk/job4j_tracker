package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item ob = new Item();
        System.out.println(ob.getLDT());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

        System.out.println(ob.getLDT().format(formatter));

    }
}
