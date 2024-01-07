package com.rag.practicals.mediator_pattern.test5;

public class Client {
    public static void main(String[] args) {
        Customer rag = new Customer("ragjn","abc street 1");
        Driver driver1 = new Driver("Rovan");
        Taxi taxi = new Taxi();
        taxi.setTaxiNumber("001");

        Taxi taxi2 = new Taxi();
        taxi2.setTaxiNumber("002");

        Taxi taxi3 = new Taxi();
        taxi3.setTaxiNumber("003");
        TaxiServiceMediator mediator = new TaxiServiceMediator();

        mediator.addTaxisToService(taxi);
        mediator.addTaxisToService(taxi2);
        mediator.addTaxisToService(taxi3);
        mediator.assignDriverToTaxi(driver1);


        System.out.println(mediator.isTaxiAvailable(taxi2));
        System.out.println(mediator.isTaxiAvailable(taxi));

        mediator.getTaxiDriverDetails();

        mediator.requestTaxi(rag);

        mediator.sendLocation(rag);

        mediator.receiveLocation(driver1);

    }
}
