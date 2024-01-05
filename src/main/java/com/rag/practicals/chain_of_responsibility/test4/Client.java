package com.rag.practicals.chain_of_responsibility.test4;

public class Client {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Director director = new Director();


        manager.setNextApprover(director);

        PurchaseOrder order1 = new PurchaseOrder(1,800);
        PurchaseOrder order2 = new PurchaseOrder(2,3500);
        PurchaseOrder order3 = new PurchaseOrder(3,10000);

        manager.processRequest(order1);
        manager.processRequest(order2);
        manager.processRequest(order3);
    }
}
