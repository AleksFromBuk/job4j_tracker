package ru.job4j.ex;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String mesagge) {
        super(mesagge);
    }
}
