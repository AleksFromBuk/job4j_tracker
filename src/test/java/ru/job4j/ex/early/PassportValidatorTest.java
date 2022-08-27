package ru.job4j.ex.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PassportValidatorTest {

    @Test
    public void whenIsNull() {
        String result = null;
        try{
            PassportValidator.validate(null);
        }
        catch (IllegalArgumentException ex) {
            result = ex.getMessage();
        }
        assertThat(result).isEqualTo("nothing to check");
    }

    @Test
    public void whenLengthisIncorrect() {
        String result = PassportValidator.validate("pasword");
        assertThat(result).isEqualTo("incorrect password length");
    }

    @Test
    public void whenWithOutUpperCase() {
        String result = PassportValidator.validate("asd#fg123hjklzxc");
        assertThat(result).isEqualTo("Password must "
                + "contain at least one uppercase character");
    }

    @Test
    public void whenWithOutLowerCase() {
        String result = PassportValidator.validate("ASDF%G2342HJKL");
        assertThat(result).isEqualTo( "Password must "
                + "contain at least one lowercase character");
    }

    @Test
    public void whenWithOutDigit() {
        String result = PassportValidator.validate("ASD^FGasdHJKL");
        assertThat(result).isEqualTo( "Password contains at least one number");
    }

    @Test
    public void whenWithOutDigitAndCharacter() {
        String result = PassportValidator.validate("ASD333FGasdHJKL");
        assertThat(result).isEqualTo( "The password must contain at least one "
                + "special character. character is not a digit or letter");
    }

    @Test
    public void whenContainStopSubstr() {
        String result = PassportValidator.validate("#pASsWorD333FGasdHJKL");
        assertThat(result).isEqualTo("The password does not contain case-insensitive substrings:"
                + " \"qwerty\", \"12345\", \"password\", \"admin\", \"user\"");
    }

    @Test
    public void whenAllCorrect() {
        String result = PassportValidator.validate("@ASD333FGasdHJKL");
        assertThat(result).isEqualTo( "password is correct!");
    }

}