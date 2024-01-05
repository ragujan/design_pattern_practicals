package com.rag.practicals.chain_of_responsibility.test4;

public class Director implements Approver{
    Approver nextApprover;
    @Override
    public void processRequest(PurchaseOrder order) {

        if(order.getAmount()<5000){
            System.out.println("Director approved this purchase order # "+order.getOrderNumber());
        }else if(nextApprover!=null){
            nextApprover.processRequest(order);
        }else{
            System.out.println("Director didn't approve this order # "+order.getOrderNumber());
        }
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}
