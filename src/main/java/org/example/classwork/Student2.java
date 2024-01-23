package org.example.classwork;

public class Student2 {
    String name;
    int id;

    public Student2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + '}';
    }
}
