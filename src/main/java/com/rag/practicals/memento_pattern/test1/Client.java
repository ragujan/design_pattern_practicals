package com.rag.practicals.memento_pattern.test1;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());

        textEditor.hitUndo();
        textEditor.write("text 1");
        textEditor.write("text 2");

        textEditor.read();
        textEditor.hitSave();
        textEditor.write("buy milk and eggs ");
        textEditor.read();
        textEditor.hitUndo();
        textEditor.read();
        textEditor.write("text 1");
        textEditor.write("text 1");
        textEditor.hitSave();
        textEditor.read();
        textEditor.hitUndo();
        textEditor.read();
    }
}
