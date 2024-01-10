package com.rag.practicals.momento_pattern.test1;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());

        textEditor.write("text 1");
        textEditor.write("text 2");

        textEditor.read();
        textEditor.hitSave();
        textEditor.write("buy milk and eggs ");
        textEditor.read();
        textEditor.hitUndo();
        textEditor.read();
    }
}
