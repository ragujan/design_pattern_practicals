package com.rag.practicals.mediator_pattern.test2.components;

import com.rag.practicals.mediator_pattern.test2.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;

    }
}
