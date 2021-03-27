package ru.job4j.tracker;

public class JSONReport extends TextReport {
    public JSONReport() {

    }

    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "\t\"name\"" + " : " + "\"" + name + "\"" + ","
                + System.lineSeparator() + "\t\"body\"" + " : " + "\"" + body + "\"" +
                System.lineSeparator() + "}";
    }

    public static void main(String[] args) {
        JSONReport str = new JSONReport();
        String result = str.generate("Tron", "Slon");
        System.out.println(result);
    }
}
