package com.school;

class Person{
    private static int nextIdCounter = 1;
    protected int id;
    protected String name;

     public Person(String name){
        this.id = nextIdCounter++;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
}