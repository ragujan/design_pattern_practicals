package com.rag.practicals.composite_pattern.test1;

public class Test1 {
    public static void main(String[] args) {

        Developer dev1 = new Developer("rag",001,"Senior dev");
        Developer dev2 = new Developer("ragbag",002,"junior dev");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);


        Manager man1 = new Manager("manRag1",991,"Top Man");
        Manager man2 = new Manager("manRag2",992,"Bottom Man");
        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);


        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);

        directory.showEmployeeDetails();

    }
}
