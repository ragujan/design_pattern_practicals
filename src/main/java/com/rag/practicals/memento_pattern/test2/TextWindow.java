package com.rag.practicals.memento_pattern.test2;

public class TextWindow {
    private StringBuilder currentText ;

    public TextWindow() {
        currentText = new StringBuilder();
    }
    public String retrieveText(){
        return currentText.toString();
    }
    public void addText(String text){
        currentText.append(text);
        currentText.append("\n");
    }
    public TextWindowState save(){
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState windowState){
        this.currentText = new StringBuilder(windowState.getText());
    }
}
