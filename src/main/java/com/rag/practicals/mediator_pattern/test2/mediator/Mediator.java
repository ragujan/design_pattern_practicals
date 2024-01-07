package com.rag.practicals.mediator_pattern.test2.mediator;

import com.rag.practicals.mediator_pattern.test2.components.Component;

import javax.swing.*;

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flat);
    void createGUI();
}
