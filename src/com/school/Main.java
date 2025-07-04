package com.school;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        Student[] students = new Student[3];
        students[0] = new Student("Alice Wonderland");
        students[1] = new Student("Bob The Builder");
        students[2] = new Student("New Student");

        Course[] courses = new Course[3];
        courses[0] = new Course("Intro to Programming");
        courses[1] = new Course("Linear Algebra");
        courses[2] = new Course("New Course");

        System.out.println("\nRegistered Students:");
        for (Student student : students) {
            if (student != null) student.displayDetails();
        }

        System.out.println("\nAvailable Courses:");
        for (Course course : courses) {
            if (course != null) course.displayDetails();
        }
        System.out.println("\nSession 2: Core Domain Modelling Complete.");
        System.out.println("\nSession 3: Constructor and Auto-ID generator completed.");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(),courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(),courses[1].getCourseId(), "Late"));
        attendanceLog.add(new AttendanceRecord(students[2].getStudentId(),courses[2].getCourseId(), "Absent"));
        for(AttendanceRecord record: attendanceLog){
            record.displayDetails();
        }

        System.out.println("\nSession 4: Data Encapsulation & Attendance Recording Validation");
    }
}