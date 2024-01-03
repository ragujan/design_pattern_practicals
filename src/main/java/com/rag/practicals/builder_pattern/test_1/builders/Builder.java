package com.rag.practicals.builder_pattern.test_1.builders;

import com.rag.practicals.builder_pattern.test_1.cars.CarType;
import com.rag.practicals.builder_pattern.test_1.components.Engine;
import com.rag.practicals.builder_pattern.test_1.components.GPSNavigator;
import com.rag.practicals.builder_pattern.test_1.components.Transmission;
import com.rag.practicals.builder_pattern.test_1.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
