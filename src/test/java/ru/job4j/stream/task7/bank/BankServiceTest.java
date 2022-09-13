package ru.job4j.stream.task7.bank;

import org.junit.Test;
import ru.job4j.bank.Account;
import ru.job4j.bank.BankService;
import ru.job4j.bank.User;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        ru.job4j.bank.User user = new ru.job4j.bank.User("3434", "Petr Arsentev");
        ru.job4j.bank.BankService bank = new ru.job4j.bank.BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        ru.job4j.bank.User user = new ru.job4j.bank.User("3434", "Petr Arsentev");
        ru.job4j.bank.BankService bank = new ru.job4j.bank.BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new ru.job4j.bank.Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        ru.job4j.bank.User user = new ru.job4j.bank.User("3434", "Petr Arsentev");
        ru.job4j.bank.BankService bank = new ru.job4j.bank.BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new ru.job4j.bank.Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        ru.job4j.bank.User user = new ru.job4j.bank.User("3434", "Petr Arsentev");
        ru.job4j.bank.BankService bank = new ru.job4j.bank.BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new ru.job4j.bank.Account("5546", 150D));
        bank.addAccount(user.getPassport(), new ru.job4j.bank.Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(200D));
    }

    @Test
    public void add2Accounts() {
        ru.job4j.bank.User user = new User("3434", "Petr Arsentev");
        ru.job4j.bank.BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new ru.job4j.bank.Account("1111", 150D));
        bank.addAccount(user.getPassport(), new Account("1122", 300D));
        assertThat(bank.findByRequisite("3434", "1122").getBalance(), is(300D));
    }
}