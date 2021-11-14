package com.company;

import java.util.ArrayList;

public class RecordCatalogue {
    ArrayList students = new ArrayList();

    public RecordCatalogue() {
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printStudents() {
        for(int i = 0; i < this.students.size(); ++i) {
            Student student = (Student)this.students.get(i);
            System.out.println(student.getStudentName());
        }

    }

    public Student findStudent(String inputName) {
        for(int i = 0; i < this.students.size(); ++i) {
            Student student = (Student)this.students.get(i);
            if (inputName.equals(student.getStudentName())) {
                return student;
            }
        }

        return null;
    }
}