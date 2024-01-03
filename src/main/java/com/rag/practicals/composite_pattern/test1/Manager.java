package com.rag.practicals.composite_pattern.test1;

//Manager is a leaf
public class Manager implements Employee{

    private String name;
    private long empId;
    private String position;

    public Manager(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Emp Id is "+empId);
        System.out.println("Emp name is "+name);
        System.out.println("Emp position is "+position);
    }
}
