package org.example.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(new Student("Alice", 101));
        allStudents.add(new Student("Bob", 102));
        allStudents.add(new Student("Charlie", 100));

        Collections.sort(allStudents);

        for(Student student: allStudents) {
            System.out.println(student);
        }
    }
}
