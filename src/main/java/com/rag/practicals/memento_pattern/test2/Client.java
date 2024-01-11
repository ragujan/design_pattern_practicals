package com.rag.practicals.memento_pattern.test2;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();


        textEditor.write("hi");
        textEditor.write("rag");
        textEditor.hitSave();
        textEditor.hitUndo();
    }
}
