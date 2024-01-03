package com.rag.practicals.composite_pattern.test1;

//developer is a Leaf
public class Developer implements Employee{

    private String name;
    private long empId;
    private String position;

    public Developer(String name, long empId, String position) {
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
