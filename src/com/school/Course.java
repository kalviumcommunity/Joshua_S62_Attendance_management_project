package com.school;

public class Course implements Storable{
    private static int courseIdCounter  = 101;
    int courseId; // e.g., "CS101"
    String courseName;

    Course(String cName) {
        this.courseId = courseIdCounter++;
        this.courseName = cName;
    }

    public int getCourseId(){return courseId;};
    public String getCourseName(){return courseName;};

    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }

    @Override
    public String toDataString(){
        return "Course ID: C" + this.courseId + ", Name: " + this.courseName;
    }
}
