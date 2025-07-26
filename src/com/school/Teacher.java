package com.school;

public class Teacher extends Person {
    private String subject;

    public Teacher(String teacherName, String subject) {
        super(teacherName);
        this.subject = subject;
    }

    public String getSubjectTaught(){
        return subject;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + this.subject + " (Role: Teacher)");
    }
    
}
