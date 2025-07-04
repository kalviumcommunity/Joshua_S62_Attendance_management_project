package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;
    int studentId;
    String name;

    Student (String studentName) {
        this.studentId = nextStudentIdCounter++;
        this.name = studentName;
    }

    public int getStudentId(){return studentId;};
    public String getStudentName(){return name;};

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}