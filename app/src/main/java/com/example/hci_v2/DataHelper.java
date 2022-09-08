package com.example.hci_v2;

import java.util.ArrayList;
import java.util.Arrays;

public class DataHelper {
    private Student[] studentsArr;
    public ArrayList<Student> students;

    private Subject[] subjectsArr;
    public ArrayList<Subject> subjects;

    public DataHelper() {
         studentsArr = new Student[]{
                 new Student("pera", "peric", "12/2020", 8.5, 1, "Softversko inzenjerstvo", "perica123"),
                 new Student("Mika", "Mikic", "13/2020", 7.5, 2, "Mehanika", "mikica123")
         };
         students = new ArrayList<Student>(Arrays.asList(studentsArr));

        subjectsArr = new Subject[]{
                new Subject(1, "Fizika", 2),
                new Subject(2, "Osnove programiranja", 1)
        };
        subjects = new ArrayList<Subject>(Arrays.asList(subjectsArr));
    }

    public boolean isValidStudent(String index, String password){
        for(Student s : students){
            if(s.getIndex().equals(index) && s.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public int findStudentId(String index) {
        for(Student s: students){
            if(s.getIndex().equals(index))
                return s.getId();
        }
        return -1;
    }

    public ArrayList<Subject> findStudentSubjects(int studentId) {
        ArrayList<Subject> studentSubjects  = new ArrayList<Subject>();
        for(Subject s: subjects){
            if(s.getStudentId() == studentId)
                studentSubjects.add(s);
        }
        return studentSubjects;
    }
}
