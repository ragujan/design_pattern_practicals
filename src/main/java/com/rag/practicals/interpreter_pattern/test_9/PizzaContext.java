package com.rag.practicals.interpreter_pattern.test_9;

import java.util.HashMap;
import java.util.Map;

public class PizzaContext {
    private Map<String,Boolean> customizationOptions;

    public PizzaContext() {
        this.customizationOptions = new HashMap<>();
    }
    public void addTopping(String topping){
        customizationOptions.put(topping, true);
    }
    public void removeTopping(String topping){
        customizationOptions.put(topping, false);
    }
    public Map<String,Boolean> getCustomizationOptions(){
        return customizationOptions;
    }
}

