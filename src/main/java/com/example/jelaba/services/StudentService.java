package com.example.jelaba.services;

import com.example.jelaba.models.Student;

public interface StudentService {

    Student getStudentByName(String name);
    Student getStudentByGroup(String group);
    Student getStudentByAddmitedYear(int year);
}
