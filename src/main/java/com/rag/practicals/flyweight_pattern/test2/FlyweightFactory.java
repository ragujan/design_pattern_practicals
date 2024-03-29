package com.rag.practicals.flyweight_pattern.test2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String,Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key){
        if(!flyweights.containsKey(key)){
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }
}
