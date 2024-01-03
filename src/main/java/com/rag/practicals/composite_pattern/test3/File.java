package com.rag.practicals.composite_pattern.test3;

public class File implements Component{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("file name is "+name);
    }
}
