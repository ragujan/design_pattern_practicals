package com.rag.practicals.memento_pattern.test2;

//Memento
public class TextWindowState {
    private String text;

    public TextWindowState(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
