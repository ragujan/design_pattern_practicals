package com.rag.practicals.chain_of_responsibility.test3;

public class Filter2 implements Filter {
    Filter nextFilter;

    @Override
    public void handleRequest(Request request) {
        if (request.getParameters().containsKey("username") && request.getParameters().containsKey("password")) {
            System.out.println("filer 2 checks attributes");
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
