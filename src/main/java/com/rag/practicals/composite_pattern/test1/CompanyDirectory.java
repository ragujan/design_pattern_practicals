package com.rag.practicals.composite_pattern.test1;

import java.util.LinkedList;
import java.util.List;

//composite
public class CompanyDirectory implements Employee{

    private List<Employee> employeeList = new LinkedList<>();

    @Override
    public void showEmployeeDetails() {
        for(Employee emp:employeeList){
            emp.showEmployeeDetails();
            System.out.println("---------");
        }
    }


    public void addEmployee(Employee employee ){
        employeeList.add(employee);
    }
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

}
