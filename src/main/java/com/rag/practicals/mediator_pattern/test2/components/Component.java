package com.rag.practicals.mediator_pattern.test2.components;

import com.rag.practicals.mediator_pattern.test2.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
