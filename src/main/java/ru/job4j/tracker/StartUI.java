package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while(run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            System.out.println();
            if(select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println();
            } else if (select == 1) {
                Item[] inf = tracker.findAll();
                for(Item i : inf) {
                    System.out.println(i);
                }
                System.out.println();
            } else if (select == 2) {
                System.out.print("enter id item: ");
                int index = Integer.valueOf(scanner.nextLine());
                if (tracker.findById(index) == null) {
                    System.out.println("element by id not found...");
                    System.out.println();
                } else {
                    System.out.print("enter name of the element to replace with: ");
                    Item newElement = new Item(scanner.nextLine());
                    if (tracker.replace(index, newElement)) {
                        System.out.println("complete");
                        System.out.println();
                    } else {
                        System.out.println("operation failed...");
                        System.out.println();
                    }
                }
            } else if (select == 3) {
                System.out.print("enter id item: ");
                int index = Integer.valueOf(scanner.nextLine());
                if (!tracker.delete(index)) {
                    System.out.println("operation failed...");
                    System.out.println();
                } else {
                    System.out.println("complete");
                    System.out.println();
                }
            } else if (select == 4) {
                System.out.print("enter id item: ");
                int index = Integer.valueOf(scanner.nextLine());
                Item rsl = tracker.findById(index);
                if (rsl  == null) {
                    System.out.println("element by id not found...");
                    System.out.println();
                } else {
                    System.out.println("result: " + rsl);
                    System.out.println();
                }
            } else if (select == 5) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] data = tracker.findByName(name);
                if (data.length == 0) {
                    System.out.println("Заявки с таким именем не найдены");
                    System.out.println();
                } else {
                    for (Item i : data) {
                        System.out.println(i);
                    }
                    System.out.println();
                }
            } else if (select == 6) {
                run = false;
                System.out.println();
            }
        }
    }

    private void showMenu() {
        System.out.println("=======   Menu   =======.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
