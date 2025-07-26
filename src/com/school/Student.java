package com.school;

public class Student extends Person {
    private String gradeLevel;

    public Student (String studentName, String gradeLevel) {
        super(studentName);
        this.gradeLevel = gradeLevel;
    }

    public int getStudentId(){return getId();};
    public String getStudentName(){return getName();};

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade Level: " + this.gradeLevel + " (Role: Student)");
    }
}