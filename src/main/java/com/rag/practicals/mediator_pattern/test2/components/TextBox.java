package com.rag.practicals.mediator_pattern.test2.components;

import com.rag.practicals.mediator_pattern.test2.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TextBox extends JTextArea implements Component {
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
