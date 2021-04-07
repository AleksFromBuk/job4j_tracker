/*
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
*/
package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker example = new Tracker();
        //Item elementFirst = example.add(new Item(3,"filed_name"));
        Item elementFirst = example.add(new Item());
        Item elementSecond = example.findById(example.lastUsingIds());
        System.out.println(elementSecond.getId());

    }
}