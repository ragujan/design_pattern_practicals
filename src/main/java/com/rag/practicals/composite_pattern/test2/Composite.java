package com.rag.practicals.composite_pattern.test2;

import java.util.LinkedList;
import java.util.List;

public class Composite implements Component{
    String name;
    List<Component> componentList = new LinkedList<>();

    public Composite(String name) {
        this.name = name;
    }
    public void add(Component component){
        componentList.add(component);
    }
    @Override
    public void showPrice() {
        for (Component comp:componentList
             ) {
            comp.showPrice();
        }
    }
}
