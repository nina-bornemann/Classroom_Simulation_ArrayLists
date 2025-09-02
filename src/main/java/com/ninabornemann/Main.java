package com.ninabornemann;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Nina", "Bornemann", 261);
        Student student2 = new Student("Alex", "Müller", 348);
        Student student3 = new Student("Lena", "Schmidt", 167);

        List<Student> studentList = new ArrayList<>(List.of(student1, student2, student3));

        System.out.println(studentList);

        School academy = new School();

        academy.addStudent(student1);
        academy.addStudent(student2);
        academy.addStudent(student3);
        academy.printAllStudents();

        academy.getStudentById(348);
        academy.getStudentById(261);
        academy.getStudentById(678);

        academy.removeStudent(2);
        academy.printAllStudents();

        Seminar s001 = new Seminar("Biology", "Mrs. Bio", 35);
        Seminar s002 = new Seminar("Geography", "Mr. Geo", 12);

        student1.addSeminar(s001);
        student1.printSeminars();

        student1.addSeminar(s002);
        student1.printSeminars();

        student3.addSeminar(s002);

        academy.getSeminarsByStudentId(167);
        academy.getSeminarsByStudentId(261);
    }
}