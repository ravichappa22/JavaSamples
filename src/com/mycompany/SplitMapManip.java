package com.mycompany;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SplitMapManip {

    public static void main(String args[]) {
        String serverhosts = "localhost:8090,localhost2:8091,localhost3:8092";
        Map<String,String> hostportmap = new HashMap();
        Arrays.stream(serverhosts.split(",")).distinct().forEach(str -> {
            String[] hostportarray = str.split(":");
            hostportmap.put(hostportarray[0], hostportarray[1]);
        });
        System.out.println(hostportmap);
    }
}
