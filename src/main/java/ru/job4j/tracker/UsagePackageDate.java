package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        LocalTime currTime = LocalTime.now();
        System.out.println("Текущее время: " + currTime);

        LocalDateTime currValue = LocalDateTime.now();
        System.out.println("Текущие дата и время до форматирования: " + currValue);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currValue.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
