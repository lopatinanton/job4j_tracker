package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public void printInfo() {
        System.out.println("Имеется ошибка: " + active);
        System.out.println("Количество ошибок:  " + status);
        System.out.println("Информация об ошибке: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error bug = new Error(true, 5, " Некорректно загружен файл, повторите попытку.");
        Error empty = new Error(false, 0," Ошибка не найдена");
        error.printInfo();
        bug.printInfo();
        empty.printInfo();
    }
}
