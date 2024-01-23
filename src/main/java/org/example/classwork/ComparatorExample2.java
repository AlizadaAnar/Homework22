package org.example.classwork;

import java.util.*;

public class ComparatorExample2 {
    public static void main(String[] args) {

        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("Blice", 101));
        studentList.add(new Student2("Cob", 102));
        studentList.add(new Student2("Aharlie", 100));

        //sort the list using comparator
        Collections.sort(studentList, new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        for(Student2 student: studentList) {
            System.out.println(student);
        }

    }
}
