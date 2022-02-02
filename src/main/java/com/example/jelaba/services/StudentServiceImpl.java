package com.example.jelaba.services;

import com.example.jelaba.db.DbManager;
import com.example.jelaba.models.Student;

public class StudentServiceImpl implements StudentService {

    @Override
    public Student getStudentByName(String name) {
        Student student = null;
        for (Student s: DbManager.getStudents()) {
            if(name.equals(s.getName())) {
                student = s;
            }
        }
        return student;
    }

    @Override
    public Student getStudentByGroup(String group) {
        Student student = null;
        for (Student s: DbManager.getStudents()) {
            if(group.equals(s.getGroup())) {
                student = s;
            }
        }
        return student;
    }

    @Override
    public Student getStudentByAddmitedYear(int year) {
        Student student = null;
        for (Student s: DbManager.getStudents()) {
            if(year == s.getAddmitedYear()) {
                student = s;
            }
        }
        return student;
    }
}
