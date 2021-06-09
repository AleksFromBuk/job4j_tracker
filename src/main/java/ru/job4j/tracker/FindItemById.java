package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "=== find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int index = input.askInt("enter id item: ");
        Item rsl = tracker.findById(index);
        if (rsl == null) {
            System.out.println("element by id not found...");
        } else {
            System.out.println("result: " + rsl);
        }
        System.out.println();
        return true;
    }
}
