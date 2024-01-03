package com.rag.practicals.builder_pattern.test_1.cars;

import com.rag.practicals.builder_pattern.test_1.components.Engine;
import com.rag.practicals.builder_pattern.test_1.components.GPSNavigator;
import com.rag.practicals.builder_pattern.test_1.components.Transmission;
import com.rag.practicals.builder_pattern.test_1.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;

    private final Transmission transmission;
    private final TripComputer tripComputer;

    private  final GPSNavigator gpsNavigator;


    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print(){
        String info = "";

        info += "Type of car "+carType+"\n";
        info += "Seat Count "+ seats + "\n";
        info += "Engine volume "+ engine.getVolume()+" mileage "+engine.getMileage()+" \n";
        info += "Transmission "+transmission + "\n";

        if(this.tripComputer != null){
            info += "Trip computer: Functional "+ "\n";
        }else{
            info += "Trip Computer: N/A"+ "\n";
        }
        if(this.gpsNavigator != null){
            info += "GPS Navigator: functional "+"\n";
        }else{
            info += "GPS Navigator: N/A " + "\n";

        }
        return info;

        
    }
}
