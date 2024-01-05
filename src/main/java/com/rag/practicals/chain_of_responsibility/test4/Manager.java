package com.rag.practicals.chain_of_responsibility.test4;

public class Manager implements Approver{
    private Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(PurchaseOrder order) {
        if(order.getAmount() <= 1000){
            System.out.println("manager approved this purchase "+order.getOrderNumber());
        }else if(nextApprover !=null){
            nextApprover.processRequest(order);
        }else{
            System.out.println("No one can handle the purchase order # "+order.getOrderNumber());
        }

    }
}
