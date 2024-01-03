package com.rag.practicals.builder_pattern.test_1.demo;

import com.rag.practicals.builder_pattern.test_1.builders.CarBuilder;
import com.rag.practicals.builder_pattern.test_1.builders.CarManualBuilder;
import com.rag.practicals.builder_pattern.test_1.cars.Car;
import com.rag.practicals.builder_pattern.test_1.cars.Manual;
import com.rag.practicals.builder_pattern.test_1.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();

        System.out.println("car type is "+car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n"+carManual.print());
    }
}
