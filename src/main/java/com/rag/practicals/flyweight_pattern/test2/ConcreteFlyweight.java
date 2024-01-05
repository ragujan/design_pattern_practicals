package com.rag.practicals.flyweight_pattern.test2;

public class ConcreteFlyweight implements Flyweight{
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState ){
        this.intrinsicState = intrinsicState;
    }
    @Override
    public void operation(String extrinsicState) {
        System.out.println("Intrinsic state "+intrinsicState+" Extrinsic state "+extrinsicState);
    }
}
