package com.rag.practicals.mediator_pattern.test2.components;

import com.rag.practicals.mediator_pattern.test2.mediator.Mediator;
import com.rag.practicals.mediator_pattern.test2.mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
    Mediator mediator;

    private ListModel listModel;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setList(ListModel listModel) {
        this.listModel = listModel;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
        searchElements(start);
    }

    private void searchElements(String s) {
        if (listModel == null) {
            return;
        }


        if (s.equals("")) {
//            do things with mediator
            mediator.setElementsList(listModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();

        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note) listModel.getElementAt(i));
        }

        DefaultListModel<Note> listModel1 = new DefaultListModel<>();

        for (Note note : notes) {
            if (note.getName().contains(s)) {
                listModel1.addElement(note);
            }
        }
        mediator.setElementsList(listModel1);

    }

    @Override
    public String getName() {
        return "Filter";
    }
}
