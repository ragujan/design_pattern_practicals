package com.rag.practicals.mediator_pattern.test5;

public class Driver {
    private Mediator mediator;
    private String locationMsg;
    private String name;

    public void setLocationMsg(String locationMsg) {
        this.locationMsg = locationMsg;
    }

    public Driver(String driver1) {
        name = driver1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    public void receiveLocationMsg(){
        System.out.println("driver "+name+" received location ");
        System.out.println("location is "+this.locationMsg);
    }


    public void addTaxi(){
        mediator.addTaxi(this);
        System.out.println("drive has a taxi ");
    }
}
