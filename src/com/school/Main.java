package com.school;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        Course[] courses = new Course[3];
        courses[0] = new Course("Intro to Programming");
        courses[1] = new Course("Linear Algebra");
        courses[2] = new Course("New Course");
        
        Person[] persons = new Person[10];
        persons[0] = new Student("Alice Wonderland", "1");
        persons[1] = new Student("Bob The Builder", "6");
        persons[2] = new Student("New Student", "10");

        persons[3] = new Teacher("Mr. Smith", "Mathematics");
        persons[4] = new Teacher("Ms. Johnson", "Computer Science");
        System.out.println("\nRegistered Teachers:");
        
        persons[5] = new Staff("Mr. Brown", "Principal");
        persons[6] = new Staff("Ms. Green", "Librarian");
        System.out.println("\nRegistered Students:");

        for (Person person : persons) {
            if(person!=null && person instanceof Student) person.displayDetails();
        }
        
        System.out.println("\nAvailable Courses:");
        for (Course course : courses) {
            if (course != null) course.displayDetails();
        }
        System.out.println("\nSession 2: Core Domain Modelling Complete.");
        System.out.println("\nSession 3: Constructor and Auto-ID generator completed.");
        System.out.println("\nSession 4: Attendance Recording System Initialized.");
        System.out.println("\nSession 5: Implement inheritance hierarchy for Person, Student, Teacher, Staff");

        String[] status = {"Present", "Absent", "Late"};

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        for(int i=0; i<status.length; i++) {
            attendanceLog.add(new AttendanceRecord(persons[i].getId(), courses[i].getCourseId(), status[i]));
        }
        for(AttendanceRecord record: attendanceLog){
            record.displayDetails();
        }

        System.out.println("\nSession 4: Data Encapsulation & Attendance Recording Validation");
    }
}