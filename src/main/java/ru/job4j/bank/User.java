package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс, для описания модели пользователя банка.
 * Эта модель содержит поля: номер паспорта и ФИО.
 * @author "copy-past"
 * @version 1.0
 */

public class User {
    /**
     * поля: номер паспорта и ФИО соответственно.
     */
    private String passport;
    private String username;

    /**
     * конструктор, принимающий два параметра типа String:
     * @param passport - данные пользователя
     * @param username - ФИО пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * далее следуют "гетеры-сеторы" полей класса соответственно
     */
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ниже реализована перегрузка методов equals и hashaCode соответственно,
     * с целью установки правил, по которым объекты типа User будут различаться
     * или считаться равными
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
