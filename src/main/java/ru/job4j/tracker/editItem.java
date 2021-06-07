package ru.job4j.tracker;

public class editItem implements UserAction {
    @Override
    public String name() {
        return "=== editItem ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int index = input.askInt("enter id item: ");
        Item newElement = new Item(input.askStr("enter name of the element to replace with: "));
        if (tracker.replace(index, newElement)) {
            System.out.println("complete");
        } else {
            System.out.println("operation failed...");
        }
        System.out.println();
        return true;
    }
}
