//package ru.job4j.tracker;
//
//import java.util.Scanner;
//
//public class AnotherInput implements Input {
//    private Scanner scanner = new Scanner(System.in);
//     String[] answers = new String[100];
//     int position = 0;
//
//    @Override
//    public String askStr(String question) {
//        System.out.print(question);
//        String ans = scanner.nextLine();
//        if(position < 100) {
//            this.answers[position++] = ans;
//        } else {
//            System.out.println("the array of this instance is overflowed...
//            Create another instance of \"AnotherInput\"");
//        }
//        return ans;
//    }
//
//    @Override
//    public int askInt(String question) {
//        return Integer.parseInt(askStr(question));
//    }
//
//    @Override
//    public String GetName() {
//        return this.answers[this.position-1];
//    }
//
////    public static void main(String args[]) {
////        AnotherInput obj = new AnotherInput();
////        obj.askStr("Enter text...: ");
////        System.out.println(obj.answers[obj.position - 1]);
////    }
//}
