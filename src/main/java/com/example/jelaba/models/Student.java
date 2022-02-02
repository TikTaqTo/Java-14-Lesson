package com.example.jelaba.models;

public class Student {

    private Long id;
    private String name;
    private String surname;
    private String group;
    private Integer addmitedYear;

    public Student(Long id, String name, String surname, String group, Integer addmitedYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.addmitedYear = addmitedYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getAddmitedYear() {
        return addmitedYear;
    }

    public void setAddmitedYear(Integer addmitedYear) {
        this.addmitedYear = addmitedYear;
    }

    @Override
    public String toString() {
        return "Student: id: " + id + ", name: " + name + ", surname: " + surname +
                ", group: " + group + ", year of admission: " + addmitedYear;
    }
}
