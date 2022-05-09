package com.mycompany;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class FunctionManip {

    public static void main(String args[]) {
        Function<LocalDate, String> addDate =
                (date) -> "The day of the week is = " + date.getDayOfWeek();
        System.out.println("addDate = " + addDate.apply(LocalDate.now()));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Sum of all numbers : " + stats.getSum());

        String s1= "ravi";
        String s2 = "chappa";
        FunctionManipIntf<String, String, Integer> result =
                (str1, str2) -> str1.length()+str2.length();

        System.out.println(result.apply(s1,s2));

        FunctionManipIntf<String, String, String> resultstr =
                (str1, str2) -> str1+str2;

        System.out.println(resultstr.apply(s1,s2));
    }


}
