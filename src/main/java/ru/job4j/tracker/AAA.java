//package ru.job4j.tracker;
//
//public class StartUI {
//
//    public static void createItem(Input input, Tracker tracker) {
//        System.out.println("=== Create a new Item ===");
//        String name = input.askStr("Enter name: ");
//        Item item = new Item(name);
//        tracker.add(item);
//        System.out.println();
//    }
//
//    public static void showAllItems(Input input,Tracker tracker) {
////        int select = input.askInt("enter number: ");
////        Item tmp = null;
////        switch (select) {
////            case 0 :
////                tmp = tracker.findAll()[0];
////                break;
////            case 1 :
////                tmp = tracker.findAll()[1];
////                break;
////            case 2 :
////                tmp = tracker.findAll()[2];
////                break;
////        }
////        System.out.println(tmp);
//
//        Item[] inf = tracker.findAll();
//        for(Item i : inf) {
//            System.out.println(i);
//        }
//        System.out.println();
//    }
//
//    public static void editItem(Input input, Tracker tracker) {
//        int index = input.askInt("enter id item: ");
//        String name = input.askStr("enter name of the element to replace with: ");
//        Item newElement = new Item(name);
//        if (tracker.replace(index, newElement)) {
//            System.out.println("complete");
//        } else {
//            System.out.println("operation failed...");
//        }
//        System.out.println();
//    }
//
//    public static void deleteItem(Input input, Tracker tracker) {
//        int index = input.askInt("enter id item: ");
//        if (!tracker.delete(index)) {
//            System.out.println("operation failed...");
//        } else {
//            System.out.println("complete");
//        }
//        System.out.println();
//    }
//
//    public static void findItemById(Input input, Tracker tracker) {
//        int index = input.askInt("enter id item: ");
//        Item rsl = tracker.findById(index);
//        if (rsl  == null) {
//            System.out.println("element by id not found...");
//        } else {
//            System.out.println("result: " + rsl);
//        }
//        System.out.println();
//    }
//
//    public static void findItemsByName(Input input, Tracker tracker) {
//        String name = input.askStr("Enter name: ");
//        Item[] data = tracker.findByName(name);
//        if (data.length == 0) {
//            System.out.println("Заявки с таким именем не найдены");
//        } else {
//            for (Item i : data) {
//                System.out.println(i);
//            }
//        }
//        System.out.println();
//    }
//
//    public void init(Input input, Tracker tracker)  {
//        boolean run = true;
//        while(run) {
//            this.showMenu();
//            int select = input.askInt("Select: ");
//            if(select == 0) {
//                  StartUI.createItem(input, tracker);
//            } else if (select == 1) {
//                StartUI.showAllItems(input, tracker);
//            } else if (select == 2) {
//                StartUI.editItem(input, tracker);
//            } else if (select == 3) {
//               StartUI.deleteItem(input, tracker);
//            } else if (select == 4) {
//                StartUI.findItemById(input, tracker);
//            } else if (select == 5) {
//                StartUI.findItemsByName(input, tracker);
//            } else if (select == 6) {
//                run = false;
//                System.out.println();
//            }
//        }
//    }
//
//    private void showMenu() {
//        System.out.println("=======   Menu   =======");
//        System.out.println("0. Add new Item");
//        System.out.println("1. Show all items");
//        System.out.println("2. Edit item");
//        System.out.println("3. Delete item");
//        System.out.println("4. Find item by Id");
//        System.out.println("5. Find items by name");
//        System.out.println("6. Exit Program");
//    }
//
//    public static void main(String[] args) {
//        Input input = new ConsoleInput();
//        Tracker tracker = new Tracker();
//        new StartUI().init(input, tracker);
//    }
//}
//}