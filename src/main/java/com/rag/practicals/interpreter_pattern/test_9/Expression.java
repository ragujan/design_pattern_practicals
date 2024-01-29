package com.rag.practicals.interpreter_pattern.test_9;

import java.util.List;

public interface Expression {
    List<String> interpret(Context ctx);
}
