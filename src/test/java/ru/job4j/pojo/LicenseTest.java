package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.util.Date;

public class LicenseTest {

    @Test
    public void allmethodsqq() {
        License first = new License();
        first.setCode("audio");
        Date tmp = new Date();
        first.setCreated(tmp);
        first.setModel("asd");
        first.setOwner("qwerty");
        License second = new License();
        second.setCode("audio");
        second.setCreated(tmp);
        second.setModel("asd");
        second.setOwner("qwerty");
        assertThat(first, is(second));
    }

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }
}