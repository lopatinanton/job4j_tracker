package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.job4j.early.PasswordValidator.*;
import static org.assertj.core.api.Assertions.assertThat;

class PasswordValidatorTest {
    @Test
    public void whenEmptyPasswordInvalid() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate(null);
                });
        assertThat(exception.getMessage()).isEqualTo("Enter password");
    }

    @Test
    public void whenLengthPasswordLess() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("Anton");
                });
        assertThat(exception.getMessage()).isEqualTo("The password length is in the range [8, 32]");
    }

    @Test
    public void whenLengthPasswordLarge() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("Anton-1234-1234-Anton-12334-12334");
                });
        assertThat(exception.getMessage()).isEqualTo("The password length is in the range [8, 32]");
    }

    @Test
    public void whenMissingSymbolUpper() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("cantonization");
                });
        assertThat(exception.getMessage()).isEqualTo("The password contains at least one uppercase character.");
    }

    @Test
    public void whenMissingSymbolLower() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("JAVA LANG");
                });
        assertThat(exception.getMessage()).isEqualTo("The password contains at least one lowercase character.");
    }

    @Test
    public void whenMissingSymbolDigital() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("Tony Tony");
                });
        assertThat(exception.getMessage()).isEqualTo("The password contains at least one digit.");
    }

    @Test
    public void whenMissingSpecialSymbol() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("YONtong345");
                });
        assertThat(exception.getMessage()).isEqualTo("The password contains at least one special character.");
    }

    @Test
    public void whenSubString() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("YONgong12345@");
                    PasswordValidator.validate("YONgongadmin@");
                    PasswordValidator.validate("TESTyounUSER5&");
                });
        assertThat(exception.getMessage()).isEqualTo("The password does not contain case-insensitive substrings:"
                +
                " \"qwerty\", \"12345\", \"password\", \"admin\", \"user\"");
    }

    @Test
    void whenCorrectPassword() {
        assertThat(PasswordValidator.validate("Anton-123")).isEqualTo("Anton-123");
    }

}