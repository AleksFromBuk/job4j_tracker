/*package ru.job4j.oop;

public class Cat {
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
*/
package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("котик " + this.name + " ел " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {

        /*System.out.println("There are gav's food.");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show();*/
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Rajab");
        gav.show();
    }
}