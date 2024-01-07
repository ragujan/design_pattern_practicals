package com.rag.practicals.mediator_pattern.test2;

import com.rag.practicals.mediator_pattern.test2.components.*;
import com.rag.practicals.mediator_pattern.test2.mediator.Editor;
import com.rag.practicals.mediator_pattern.test2.mediator.Mediator;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
