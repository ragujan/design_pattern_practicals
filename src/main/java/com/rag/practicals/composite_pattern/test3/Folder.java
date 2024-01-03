package com.rag.practicals.composite_pattern.test3;

import java.util.LinkedList;
import java.util.List;

public class Folder implements Component{
    private List<Component> componentList = new LinkedList<>();
    private String folderName;

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(Component component){
        componentList.add(component);
    }
    @Override
    public void showDetails() {
        for (Component component:componentList
             ) {
            component.showDetails();
        }
    }
}
