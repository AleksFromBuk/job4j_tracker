package ru.job4j.tracker;

public class FindItemsByName implements UserAction {
    @Override
    public String name() {
        return "=== find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] data = tracker.findByName(name);
        if (data.length == 0) {
            System.out.println("items not found...");
        } else {
            for (Item i : data) {
                System.out.println(i);
            }
        }
        System.out.println();
        return true;
    }
}
