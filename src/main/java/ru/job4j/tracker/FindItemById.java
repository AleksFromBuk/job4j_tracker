package ru.job4j.tracker;

public class FindItemById implements UserAction {
    private final Output out;

    public FindItemById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int index = input.askInt("enter id item: ");
        Item rsl = tracker.findById(index);
        if (rsl == null) {
            out.println("element by id not found...");
        } else {
            out.println("result: " + rsl);
        }
        return true;
    }
}
