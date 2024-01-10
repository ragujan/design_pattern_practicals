package com.rag.practicals.momento_pattern.test1;

//Momento
public class TextWindowState {
    private String text;

    public TextWindowState(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
