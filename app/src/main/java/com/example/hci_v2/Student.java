package com.example.hci_v2;

public class Student {
    private String name;
    private String surname;
    private String index;
    private double avgMark;
    private int id;
    private String direction;
    private String password;

    public Student(String name, String surname, String index, double avgMark, int id, String direction, String password) {
        this.name = name;
        this.surname = surname;
        this.index = index;
        this.avgMark = avgMark;
        this.id = id;
        this.direction = direction;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIndex() {
        return index;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public int getId() {
        return id;
    }

    public String getDirection() {
        return direction;
    }

    public String getPassword() {
        return password;
    }
}
