package ru.job4j.ex.early;

import java.util.Arrays;
import java.util.List;

public class PassportValidator {

    public static String validate(String password) throws IllegalArgumentException {
        if (password == null) {
            throw new IllegalArgumentException("nothing to check");
        }
        if (!(password.length() >= 8 && password.length() <= 32)) {
            throw new IllegalArgumentException("incorrect password length");
        }
        if (!checkUpperCase(password)) {
            throw new IllegalArgumentException("Password must "
                    + "contain at least one uppercase character");
        }
        if (!checkLowerCase(password)) {
            throw new IllegalArgumentException("Password must "
                    + "contain at least one lowercase character");
        }
        if (!checkNumber(password)) {
            throw new IllegalArgumentException("Password contains at least one number");
        }
        if (!checkNotDigitAndNotLetter(password)) {
            throw new IllegalArgumentException("The password must contain at least one "
                    + "special character. character is not a digit or letter");
        }
        if (!checkConstSubstr(password)) {
            throw new IllegalArgumentException("The password does not contain"
                    + " case-insensitive substrings:"
                    + " \"qwerty\", \"12345\", \"password\", \"admin\", \"user\"");
        }
        return "password is correct!";
    }

    private static boolean checkConstSubstr(String password) {
        List<String> stopList = Arrays.asList("qwerty", "12345", "password", "admin", "user");
        String tmp = password.toLowerCase();
        for (String it: stopList) {
            if (tmp.contains(it)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNotDigitAndNotLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
