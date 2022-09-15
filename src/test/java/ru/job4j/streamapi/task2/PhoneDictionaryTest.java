package ru.job4j.streamapi.task2;

import org.junit.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @org.junit.Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Petr", "surname", "0000001", "Sn.Petr"));

        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
        assertThat(persons.get(1).getPhone(), is("0000001"));
    }

    @Test
    public void whenNotFound() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        var persons = phones.find("qwerty");
        assertThat(persons.size(), is(0));
    }
}