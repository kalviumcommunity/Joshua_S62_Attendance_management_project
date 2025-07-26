package com.school;

public class Staff extends Person {
    private String role;

    public Staff(String staffName, String role) {
        super(staffName);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + role + " (Role: Non-Teaching Staff)");
    }
    
}
