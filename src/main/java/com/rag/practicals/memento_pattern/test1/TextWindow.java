package com.rag.practicals.memento_pattern.test1;

//Originator
public class TextWindow {
    private StringBuilder currentText;
    public TextWindow(){
        this.currentText = new StringBuilder();
    }
    public StringBuilder retrieve(){
        return this.currentText;
    }
    public TextWindowState save(){
        return new TextWindowState(currentText.toString());
    }
    public void restore(TextWindowState save){
        this.currentText = new StringBuilder(save.getText());
        save();
    }
    public void addText(String text){
        currentText.append(text);
        currentText.append("\n");
    }

}
