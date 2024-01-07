package com.rag.practicals.mediator_pattern.test2.components;

import com.rag.practicals.mediator_pattern.test2.mediator.Mediator;
import com.rag.practicals.mediator_pattern.test2.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public AddButton(){
        super("Add");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent){
        //do things with mediator;
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName(){
        return "AddButton";
    }

}
