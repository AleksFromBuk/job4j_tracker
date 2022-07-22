package ru.job4j.tracker;

import java.util.List;

public class ShowAllItems implements UserAction {
    private final Output out;

    public ShowAllItems(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> inf = tracker.findAll();
        if (inf.size() == 0) {
            out.println("items not found...");

        } else {
            for (Item i : inf) {
                out.println(i);
            }
        }
        return true;
    }
}