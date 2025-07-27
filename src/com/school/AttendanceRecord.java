package com.school;

public class AttendanceRecord implements Storable {
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status){
        this.studentId = studentId;
        this.courseId = courseId;
        if("Present".equalsIgnoreCase(status)||"Absent".equalsIgnoreCase(status)){
            this.status = status;
        }else{
            this.status = "invalid";
            System.out.println("Invalid attendance status provided");
        }
    }
    
    public int getStudentId(){return studentId;};
    public int getCourseId(){return courseId;};
    public String getStatus(){return status;};

    public void displayDetails(){
        System.out.println("Attendance StudentId: "+studentId+" in course ID "+courseId+" is "+status);
    }

    @Override
    public String toDataString(){
        return "Attendance Record - Student ID: " + studentId + ", Course ID: " + courseId + ", Status: " + status;
    }
}
