package com.ninabornemann;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> studentsAtSchool = new ArrayList<>();

    public void addStudent(Student s) {
        studentsAtSchool.add(s);
    }

    public void removeStudent(Student s) {
        studentsAtSchool.remove(s);
    }

    public void printAllStudents() {
        for (Student s : studentsAtSchool) {
            System.out.println(s);
        }
    }

    public void getSeminarsByStudentId(int id) {
        for (Student s : studentsAtSchool) {
            if ( id == s.getStudentId()) {
                s.printSeminars();
                return;
            }
        }
        System.out.println("There is no student with this Id at this school.");
    }

    public void getStudentById(int id) {
        for (Student s : studentsAtSchool) {
            if ( id == s.getStudentId()) {
                System.out.println("The student with this Id is: " + s + " !");
                return;
            }
        }
        System.out.println("There is no student with this Id at this school.");
    }
}
