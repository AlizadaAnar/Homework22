package org.example.classwork;

public class Student implements Comparable<Student>{

    public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
