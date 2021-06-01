package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void toGo() {
        System.out.println("vehicle in motion ...");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Текущее количетво перевозимых пассажиров: " + count);
    }

    @Override
    public float refuel(int count) {
        return count * 66.37f;
    }
}
