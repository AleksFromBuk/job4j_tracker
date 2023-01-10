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
        Customer tmp = null;
        for (int i = 0; i < cnt - 1; i++) {
            queue.poll();
        }
        tmp = queue.poll();
        return  tmp != null ? tmp.getName() : null;
    }
}