package com.rag.practicals.mediator_pattern.test6;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Customer customer = new Customer(mediator,"Sam");
        Employee employee = new Employee(mediator,"Employee1");

        customer.sendMessage("Hi");



    }
}
