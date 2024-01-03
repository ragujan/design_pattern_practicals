package com.rag.practicals.chain_of_responsibility.test2;

public class Request {
    private final String type;

    public Request(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
