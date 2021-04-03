package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.setFIO("mr.Bin");
        ob.setDateOfAdmission(new Date());
        ob.setGroup("BarakNumberOne");

        System.out.println(ob.getFIO() + '\n' + ob.getDateOfAdmission() + '\n' + ob.getGroup());
    }
}
