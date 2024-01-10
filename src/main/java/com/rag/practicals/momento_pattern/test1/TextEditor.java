package com.rag.practicals.momento_pattern.test1;

//Caretaker
public class TextEditor {
    private TextWindow textWindow;
    private TextWindowState textWindowState;

    public void write(String text) {
        this.textWindow.addText(text);
    }

    public void read() {
        System.out.println(textWindow.retrieve().toString());
    }

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void hitSave() {
        textWindowState = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(textWindowState);
    }


}
