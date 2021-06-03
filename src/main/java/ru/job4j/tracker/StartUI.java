package ru.job4j.tracker;

public class StartUI {


    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println();
    }

    public static void showAllItems(Input input, Tracker tracke) {
        Item[] inf = tracke.findAll();
        for (Item i : inf) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void editItem(Input input, Tracker tracker) {
        int index = input.askInt("enter id item: ");
        Item newElement = new Item(input.askStr("enter name of the element to replace with: "));
        if (tracker.replace(index, newElement)) {
            System.out.println("complete");
        } else {
            System.out.println("operation failed...");
        }
        System.out.println();
    }

    public static void deleteItem(Input input, Tracker tracke) {
        int index = input.askInt("enter id item: ");
        if (!tracke.delete(index)) {
            System.out.println("operation failed...");
        } else {
            System.out.println("complete");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        int index = input.askInt("enter id item: ");
        Item rsl = tracker.findById(index);
        if (rsl == null) {
            System.out.println("element by id not found...");
        } else {
            System.out.println("result: " + rsl);
        }
        System.out.println();
    }


    public static void findItemsByName(Input input, Tracker tracker) {
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
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while(run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
                } else if (select == 1) {
                StartUI.showAllItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if(select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if(select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6) {
                System.out.println("Пользователь выбрал: " + select);
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println();
        System.out.println( '\n' + "Menu:");
        for(int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
        System.out.println("end program");
    }
}
