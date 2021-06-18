package ru.job4j.tracker;

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
        Item[] data = tracker.findByName(name);
        if (data.length == 0) {
            out.println("items not found...");
        } else {
            for (Item i : data) {
                out.println(i);
            }
        }
        //out.println("");
        return true;
    }
}
