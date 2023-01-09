package ru.job4j.queue;

import java.util.Queue;
import static java.lang.Math.min;
public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        return calculate(min(count, queue.size()));
    }

    public String getLastUpsetCustomer() {
        return calculate(min(count, queue.size()) + 1);
    }

    public String calculate(int cnt) {
        String res = null;
        Customer tmp = null;
        for (int i = 0; i < cnt; i++) {
            tmp = queue.poll();
            res = tmp != null ? tmp.getName() : null;
        }
        return res;
    }
}