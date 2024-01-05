package com.rag.practicals.chain_of_responsibility.test4;

public class PurchaseOrder {
    private final int orderNumber;
    private final double amount;

    public PurchaseOrder(int orderNumber, double amount) {
        this.orderNumber = orderNumber;
        this.amount = amount;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getAmount() {
        return amount;
    }

}
