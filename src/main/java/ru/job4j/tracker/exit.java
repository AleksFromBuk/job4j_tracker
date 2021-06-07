package ru.job4j.tracker;

public class exit implements UserAction {
    @Override
    public String name() {
        return "=== exit ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Exit program.");
        return false;
    }
}
