package ru.job4j.tracker;

public class EditItem implements UserAction {
    private final Output out;

    public EditItem(Output out) {
        this.out = out;
    }

    public Output getOut() {
        return out;
    }

    @Override
    public String name() {
        return "=== editItem ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int index = input.askInt("enter id item: ");
        Item newElement = new Item(input.askStr("enter name of the element to replace with: "));
        if (tracker.replace(index, newElement)) {
            out.println("complete");
        } else {
            out.println("operation failed...");
        }
        out.println("");
        return true;
    }
}
