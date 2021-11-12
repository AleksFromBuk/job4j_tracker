package ru.job4j.tracker;

import java.util.List;

public class FindItemsByName implements UserAction {
    private final Output out;

    public FindItemsByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> data = tracker.findByName(name);
        if (data.size() == 0) {
            out.println("items not found...");
        } else {
            for (Item i : data) {
                out.println(i);
            }
        }
        return true;
    }
}
