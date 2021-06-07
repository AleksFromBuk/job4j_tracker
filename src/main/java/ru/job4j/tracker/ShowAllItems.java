package ru.job4j.tracker;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] inf = tracker.findAll();
        if (inf.length == 0) {
            System.out.println("items not found...");
        } else {
            for (Item i : inf) {
                System.out.println(i);
            }
            System.out.println();
            return true;
        }
    }
}