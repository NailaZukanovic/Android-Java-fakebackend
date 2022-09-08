package com.example.hci_v2;

// struktura za cuvanje podataka
public class Subject {
    private int id;
    private String name;
    private int studentId;

    public Subject(int id, String name, int studentId) {
        this.name = name;
        this.id = id;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }
}
