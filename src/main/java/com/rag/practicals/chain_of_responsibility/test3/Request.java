package com.rag.practicals.chain_of_responsibility.test3;

import java.util.Map;

public class Request {
    private Map<String,String> parameters;
    private String extension;

    public Request(Map<String, String> parameters,String extension) {
        this.parameters = parameters;
        this.extension = extension;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
    public String getExtension() {
        return extension;
    }

}
