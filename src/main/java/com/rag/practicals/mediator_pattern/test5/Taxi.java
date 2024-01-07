package com.rag.practicals.mediator_pattern.test5;

public class Taxi {
    private Mediator mediator;
    private String taxiNumber;


    public String getTaxiNumber() {
        return taxiNumber;
    }

    public void setTaxiNumber(String taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


}
