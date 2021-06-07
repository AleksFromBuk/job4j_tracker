package ru.job4j.tracker;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] inf = tracker.findAll();
        for (Item i : inf) {
            System.out.println(i);
        }
        System.out.println();
        return true;
    }
}
