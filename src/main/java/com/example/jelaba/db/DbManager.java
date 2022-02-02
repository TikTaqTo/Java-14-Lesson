package com.example.jelaba.db;

import com.example.jelaba.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Sam", "Serty", "NFT", 2010));
        students.add(new Student(2L, "Samat", "Alijanov", "NFC", 2011));
        students.add(new Student(3L, "Alex", "Belov", "KFC", 2012));
        students.add(new Student(4L, "Sam", "Serty", "ADC", 2013));
        students.add(new Student(5L, "Lex", "Luter", "CDA", 2013));
    }

    public static List<Student> getStudents() {
        return students;
    }
}
