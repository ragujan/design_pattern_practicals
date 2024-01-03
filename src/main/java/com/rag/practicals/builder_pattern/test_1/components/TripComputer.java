package com.rag.practicals.builder_pattern.test_1.components;

import com.rag.practicals.builder_pattern.test_1.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fuel level ");
    }

}
