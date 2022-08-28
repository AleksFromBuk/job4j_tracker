package ru.job4j.ex.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertThrows;

class PassportValidatorTest {
    @Test
    public void whenExceptionIsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PassportValidator.validate(null);
                });
        assertThat(exception.getMessage()).isEqualTo("nothing to check");
    }

    @Test
    public void whenExceptionLengthisIncorrect() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PassportValidator.validate("pasword");
                });
        assertThat(exception.getMessage()).isEqualTo("incorrect password length");
    }

    @Test
    public void whenExceptionWithOutUpperCase() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PassportValidator.validate("asd#fg123hjklzxc");
                });
        assertThat(exception.getMessage()).isEqualTo("Password must "
                + "contain at least one uppercase character");
    }

    @Test
    public void whenExceptionWithOutLowerCase() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PassportValidator.validate("ASDF%G2342HJKL");
                });
        assertThat(exception.getMessage()).isEqualTo( "Password must "
                + "contain at least one lowercase character");
    }

    @Test
    public void whenExceptionWithOutDigit() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PassportValidator.validate("ASD^FGasdHJKL");
                });
        assertThat(exception.getMessage()).isEqualTo( "Password "
                + "contains at least one number");
    }

    @Test
    public void whenExceptionWithOutSpecialSymbol() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PassportValidator.validate("ASD333FGasdHJKL");
                });
        assertThat(exception.getMessage()).isEqualTo( "The password must "
                + "contain at least one "
                + "special character. character is not a digit or letter");
    }

    @Test
    public void whenExceptionContainStopSubstr() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PassportValidator.validate("#pASsWorD333FGasdHJKL");
                });
        assertThat(exception.getMessage()).isEqualTo("The password does "
                + "not contain case-insensitive substrings:"
                + " \"qwerty\", \"12345\", \"password\", \"admin\", \"user\"");
    }

    @Test
    public void whenAllCorrect() {
        String result = PassportValidator.validate("@ASD333FGasdHJKL");
        assertThat(result).isEqualTo( "password is correct!");
    }

}