package com.rag.practicals.chain_of_responsibility.test3;

public class Filter1 implements Filter {
    Filter nextFilter;
    //    check for extension .jsp
    @Override
    public void handleRequest(Request request) {

        if (request.getExtension().equals(".jsp")) {
            System.out.println("filter 1 checks .jsp extension ok");
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
