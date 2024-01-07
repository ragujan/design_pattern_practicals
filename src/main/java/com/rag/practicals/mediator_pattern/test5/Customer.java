package com.rag.practicals.mediator_pattern.test5;


public class Customer {

   private Mediator mediator;
   private String name;

   private String locationDetails;

    public String getLocationDetails() {
        return locationDetails;
    }

    public Customer(String name, String locationDetails) {
        this.name = name;
        this.locationDetails = locationDetails;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestTaxi(){
        System.out.println("Customer "+name+ " requesting taxi ");
    }
    public void sendLocation(){
        mediator.sendLocation(this);
    }
}
