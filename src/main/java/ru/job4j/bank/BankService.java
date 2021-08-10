package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User tmp = findByPassport(passport);
        if (tmp != null && !users.get(tmp).contains(account)) {
            users.get(tmp).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User it : users.keySet()) {
            if (it.getPassport().equals(passport)) {
                return it;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User tmp = findByPassport(passport);
        if (tmp != null) {
            for (Account it : users.get(tmp)) {
                if (it.getRequisite().equals(requisite)) {
                    return it;
                }
            }

        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcacc = findByRequisite(srcPassport, srcRequisite);
        Account destacc = findByRequisite(destPassport, destRequisite);
        if (srcacc != null && destacc != null && srcacc.getBalance() >= amount) {
            srcacc.setBalance(srcacc.getBalance() - amount);
            destacc.setBalance(destacc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
