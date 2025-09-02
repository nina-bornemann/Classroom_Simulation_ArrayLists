package com.ninabornemann;

import java.util.Objects;

public class Seminar {

    private String name;
    private String teacher;
    private  int room;

    public Seminar(String name, String teacher, int room) {
        this.name = name;
        this.teacher = teacher;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Seminar{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", room=" + room +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seminar seminar = (Seminar) o;
        return room == seminar.room && Objects.equals(name, seminar.name) && Objects.equals(teacher, seminar.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher, room);
    }
}
