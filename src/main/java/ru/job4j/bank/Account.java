package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс, для описания модели банковского счета.
 * Эта модель содержит поля: баланс и реквизиты.
 * @author "copy-past"
 * @version 1.0
 */
public class Account {
    /**
     * Эта модель содержит поля: баланс и реквизиты.
     */
    private String requisite;
    private double balance;

    /**
     * конструктор, принимающий два параметра типа String и double:
     * @param requisite - реквизиты
     * @param balance - баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * далее следуют "гетеры-сеторы" полей класса соответственно
     */
    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * ниже реализована перегрузка методов equals и hashaCode соответственно,
     * с целью установки правил, по которым объекты типа Account будут различаться
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
