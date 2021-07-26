package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Petr", "surname", "0000001", "Sn.Petr"));



        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is ("Arsentev"));
        assertThat(persons.get(1).getPhone(), is ("0000001"));

    }

    @Test
    public void whenNotFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        ArrayList<Person> persons = phones.find("qwerty");
        assertThat(persons.size(), is (0));

    }
}