package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Главный сервис. Класс описывает работу банковской системы.
 * @author "copy-past" with AlexfromBuk
 * @version 1.0
 */

public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод должен добавить пользователя в систему.
     * Чтобы добавить пользователя в систему нужно использовать метод Map.put
     * @param user - пользователь, который добавляется в систему
     * (только в случае, если такого ещё нет в системе)
     * По умолчанию, с пользователем добавляется пустой список - new ArrayList<Account>()
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Этот метод принимает два параметра: пользователя и список счетов.
     * Должен добавить новый счет к пользователю. Первоначально пользователя     *
     * нужно найти по паспорту. Для этого нужно использовать метод findByPassport
     * @param passport - позволяет найти пользователя по его данным
     * @param account - счет, который привязывается к пользователю
     */
    public void addAccount(String passport, Account account) {
        User tmp = findByPassport(passport);
        if (tmp != null && !users.get(tmp).contains(account)) {
            users.get(tmp).add(account);
        }
    }

    /**
     * Этот метод ищет пользователя по номеру паспорта.
     * @param passport - номер паспорта
     * @return в случае, если пользователь найден, возращается
     *   ключ, соответствубщий данному пользовтелю в users, в противном
     *   случае - null
     */
    public User findByPassport(String passport) {
        for (User it : users.keySet()) {
            if (it.getPassport().equals(passport)) {
                return it;
            }
        }
        return null;
    }

    /**
     * Этот метод ищет счет пользователя по реквизитам.
     * Сначала ищется пользователь. Потом получить список счетов этого
     * пользователя и в нем найти нужный счет.
     * @param passport - данные, определяющие пользователя
     * @param requisite - реквзиты, по которым ищется целевой счет
     * @return  - целевой счет(Account), либо null
     */
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

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * @param srcPassport
     * @param srcRequisite - данные и реквизиты счета пользователя-отправителя
     * @param destPassport
     * @param destRequisite  - данные и реквизиты счета пользователя-получателя
     * @param amount - величина перевода
     * @return - если счёт не найден или не хватает денег на счёте
     * srcAccount (с которого переводят), то метод должен вернуть false.
     */
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
