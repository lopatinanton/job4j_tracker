package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
    Student student = new Student();
    student.setFirstname("Лопатин Антон Олегович");
    student.setTeam(123);
    student.setReceipt(new Date());

        System.out.println("ФИО студента: " + student.getFirstname() + System.lineSeparator() + "Группа № " + student.getTeam()
                + System.lineSeparator() + "Дата поступления - " + student.getReceipt());
    }
}
