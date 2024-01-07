package com.rag.practicals.mediator_pattern.test5;

public interface Mediator {
    void requestTaxi(Customer customer);
    boolean isTaxiAvailable(Taxi taxi);

    void sendLocation(Customer customer);

    void receiveLocation(Driver driver);

    void addTaxi(Driver driver);
}
