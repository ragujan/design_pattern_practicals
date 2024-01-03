package com.rag.practicals.chain_of_responsibility.test3;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Filter1 filter1 = new Filter1();
        Filter2 filter2 = new Filter2();
        Filter3 filter3 = new Filter3();

        filter1.setNextFilter(filter2);
        filter2.setNextFilter(filter3);

        Map<String,String> form = new HashMap<>();
        form.put("username","abc");
        form.put("password","123");

        Request request = new Request(form,".jsp");

        filter1.handleRequest(request);

    }
}
