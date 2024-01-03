package com.rag.practicals.builder_pattern.test_1.components;

public class Engine {
    private final double volume;
    private double mileage;

    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }
    public  void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(double mileage){
        if(started){
            this.mileage += mileage;
        }else{
            System.out.println("can't go must start the engine");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
