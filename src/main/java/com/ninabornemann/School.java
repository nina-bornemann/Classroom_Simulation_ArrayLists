package com.ninabornemann;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

    private List<Student> studentsAtSchool = new ArrayList<>();

    private Map<Integer, Student> students = new HashMap<>();

    private int nextId = 1;

    public void addStudent(Student s) {
        students.put(nextId, s);
        nextId++;
    }

    public void removeStudent(int key) {
        students.remove(key);
    }

    public void printAllStudents() {
        for (Map.Entry<Integer, Student> s : students.entrySet()) {
            System.out.println(s);
        }
    }

    public void getSeminarsByStudentId(int id) {
        for (Map.Entry<Integer, Student> s : students.entrySet()) {
            if ( id == s.getValue().getStudentId()) {
                s.getValue().printSeminars();
                return;
            }
        }
        System.out.println("There is no student with this Id at this school.");
    }

    public void getStudentById(int id) {
        for (Map.Entry<Integer, Student> s : students.entrySet()) {
            if ( id == s.getValue().getStudentId()) {
                System.out.println("The student with this Id is: " + s + " !");
                return;
            }
        }
        System.out.println("There is no student with this Id at this school.");
    }
}
