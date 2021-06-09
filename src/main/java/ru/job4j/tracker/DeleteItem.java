package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete an Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int index = input.askInt("enter id item: ");
        if (!tracker.delete(index)) {
            System.out.println("operation failed...");
        } else {
            System.out.println("complete");
        }
        return true;
    }
}
