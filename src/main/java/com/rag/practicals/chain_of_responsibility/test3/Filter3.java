package com.rag.practicals.chain_of_responsibility.test3;

public class Filter3 implements Filter {
    Filter nextFilter;

    @Override
    public void handleRequest(Request request) {
        if (request.getParameters().containsValue("abc") && request.getParameters().containsValue("123")) {
            System.out.println("filter 3 checks attribute values are correct");
            if (nextFilter != null) {
                nextFilter.handleRequest(request);
//                return true;
            }
        }
//        return false;
    }

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }
}
