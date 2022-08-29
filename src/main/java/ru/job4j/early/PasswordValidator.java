package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Enter password");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("The password length is in the range [8, 32]");
        }
        boolean upper = false;
        boolean lower = false;
        boolean digital = false;
        boolean special = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                upper = true;
            }
            if (Character.isLowerCase(c)) {
                lower = true;
            }
            if (Character.isDigit(c)) {
                digital = true;
            }
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                special = true;
            }
            if (upper && lower && digital && special) {
                break;
            }
        }
        if (!upper) {
            throw new IllegalArgumentException("The password contains at least one uppercase character.");
        }
        if (!lower) {
            throw new IllegalArgumentException("The password contains at least one lowercase character.");
        }
        if (!digital) {
            throw new IllegalArgumentException("The password contains at least one digit.");
        }
        if (!special) {
            throw new IllegalArgumentException("The password contains at least one special character.");
        }
        String[] subString = {"qwerty", "12345", "password", "admin", "user"};
        for (String str : subString) {
            if (password.toLowerCase().contains(str)) {
                throw new IllegalArgumentException("The password does not contain case-insensitive substrings:"
                        +
                        " \"qwerty\", \"12345\", \"password\", \"admin\", \"user\"");
            }
        }
        return password;
    }
}
