package org.example.hometask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 101, "C"));
        studentList.add(new Student("Bob", 102, "D"));
        studentList.add(new Student("Charlie", 100, "A"));

        //sort the arraylist using comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.grade.compareTo(s2.grade);
            }
        });

        //print the sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
