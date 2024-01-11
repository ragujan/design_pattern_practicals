package com.rag.practicals.memento_pattern.test2;

//CareTaker
public class TextEditor {
    private TextWindowState state;
    private TextWindow window;

    public TextEditor() {
        window = new TextWindow();
    }

    public void write(String text){
        window.addText(text);
        read();
    }
    public void read(){
        System.out.println(window.retrieveText());
    }
    public void hitSave(){
       state = window.save();
    }

    public void hitUndo(){
        window.restore(state);
    }
}
