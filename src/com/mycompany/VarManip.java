package com.mycompany;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class VarManip {

    public static void main(String args[]) {
        var mapStream = Stream.of(
                Map.entry("a", 1),
                Map.entry("b", 2),
                Map.entry("a", 3));

        var table = new HashMap<>();
         mapStream.forEach(record ->{
           table.put(record.getKey(), record.getValue());
        });
        //table.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println("entry set = " + table.entrySet());

    }
}
