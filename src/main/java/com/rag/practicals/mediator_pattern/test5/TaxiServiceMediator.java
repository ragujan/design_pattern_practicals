package com.rag.practicals.mediator_pattern.test5;

import java.util.HashMap;
import java.util.Map;

public class TaxiServiceMediator implements Mediator {

    Map<Taxi, Driver> taxiDriverMap;
    Map<Customer,Taxi > customerTaxiMap;

    public TaxiServiceMediator() {
        taxiDriverMap = new HashMap<>();
        customerTaxiMap = new HashMap<>();
    }

    @Override
    public void requestTaxi(Customer customer) {
        for (Map.Entry<Taxi, Driver> entry : taxiDriverMap.entrySet()) {

            if(entry.getKey() != null && entry.getValue() != null){
                customerTaxiMap.put(customer,entry.getKey());
                customer.requestTaxi();
                break;
            }

        }
    }

    @Override
    public boolean isTaxiAvailable(Taxi taxi) {
        for (Map.Entry<Taxi, Driver> entry : taxiDriverMap.entrySet()) {
            if (taxi == entry.getKey() && entry.getValue() != null) {
                return true;
            }

        }
        return false;
    }

    public void addTaxisToService(Taxi taxi) {
        boolean taxiFound = false;
        for (Map.Entry<Taxi, Driver> entry : taxiDriverMap.entrySet()) {

            if (entry.getKey() == taxi) {
                taxiFound = true;
            }
        }

        if (!taxiFound) {
            taxiDriverMap.put(taxi, null);
        }
    }

    public void getTaxiDriverDetails() {
        for (Map.Entry<Taxi, Driver> entry : taxiDriverMap.entrySet()) {
            if (entry.getValue() != null) {

                System.out.println("taxi is " + entry.getKey().getTaxiNumber() + " driver is " + entry.getValue().getName());
            }
            if (entry.getValue() == null) {

                System.out.println("taxi is " + entry.getKey().getTaxiNumber() + " driver is not assigned");
            }
        }
    }

    public void assignDriverToTaxi(Driver driver) {
        for (Map.Entry<Taxi, Driver> entry : taxiDriverMap.entrySet()) {
            if (entry.getValue() == null) {
                taxiDriverMap.put(entry.getKey(), driver);
                break;
            }
        }
    }

    @Override
    public void sendLocation(Customer customer) {
        for (Map.Entry<Customer, Taxi> entry : customerTaxiMap.entrySet()) {
            if(entry.getKey() == customer){
                for (Map.Entry<Taxi, Driver> entry1 : taxiDriverMap.entrySet()) {
                   if(entry1.getKey() == entry.getValue()){
                       entry1.getValue().setLocationMsg(customer.getLocationDetails());
                   }
                }
            }
        }
    }

    @Override
    public void receiveLocation(Driver driver) {
              driver.receiveLocationMsg();
    }

    @Override
    public void addTaxi(Driver driver) {

    }
}
