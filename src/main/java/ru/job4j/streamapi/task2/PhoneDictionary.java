package ru.job4j.streamapi.task2;

import ru.job4j.search.Person;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> oldFindMethod(String key) {
        var result = new ArrayList<Person>();
        for (var val : persons) {
            if (val.getName().contains(key) || val.getSurname().contains(key)
                    || val.getPhone().contains(key)   || val.getAddress().contains(key)) {
                result.add(val);
            }
        }
        return result;
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> first = (s) -> s.getName().contains(key);
        Predicate<Person> second = (s) -> s.getSurname().contains(key);
        Predicate<Person> third = (s) -> s.getPhone().contains(key);
        Predicate<Person> last = (s) -> s.getAddress().contains(key);
        Predicate<Person> combine = first.or(second.or(third).or(last));
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
