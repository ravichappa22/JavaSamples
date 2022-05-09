package com.mycompany;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionManip {
    public static void main(String args[]) {
        int[] arrayInt = new int []{8,7,4,5,6,1,2};
        Arrays.stream(arrayInt).sorted().forEach(System.out::println);
        List<String> stringList = Arrays.asList("ravi,raju,matt,andrew,raju,ravi".split(","));
        stringList.stream().distinct().forEach(System.out::println);

        User user1 = new User("Ravi", "Chappa", "M", 40);
        User user2 = new User("Suneetha", "Chappa", "F", 35);
        User user3 = new User("Sekhar", "Chappa", "M", 30);
        User user4 = new User("Naga", "Chappa", "M", 40);

        OptionalDouble avage = Stream.of(user1,user2,user3,user4)
                .filter( u -> u.getSex().equalsIgnoreCase("M"))
                .mapToInt(User::getAge).average();
        System.out.println("avage=" + (avage.isPresent()? avage.getAsDouble() : 0));

        System.out.println("reulst = " + Stream.of(user1,user2,user3,user4)
                .collect(
                        Collectors.groupingBy(
                                User::getSex,
                                    Collectors.mapping(User::getFirstName, Collectors.toList()))));

        System.out.println("average age" +
                Stream.of(user1,user2,user3,user4)
                        .collect(Collectors.groupingBy(User::getSex,Collectors.averagingInt(User::getAge))));

        System.out.println("sum age" +
                Stream.of(user1,user2,user3,user4)
                        .collect(Collectors.groupingBy(User::getSex,
                                Collectors.reducing(0, User::getAge, Integer::sum))));

        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println("size by2" +
                Stream.of(user1,user2,user3,user4)
                .collect(Collectors.groupingBy(it -> atomicInteger.getAndIncrement() / 2)).values());

        Stream.of(user1,user2,user3,user4)
                .sorted((o1, o2) -> o1.getAge()-o2.getAge())
                    .map(User::getFirstName).forEach(System.out::println);

        List<List<String>> lists = Arrays.asList(Arrays.asList("a,b".split(",")),
                Arrays.asList("c,d".split(",")));
        //lists.stream().map(String::toUpperCase).collect(Collectors.toList());
         Stream.of("a,b")
                .map(String::toUpperCase)
                .collect(Collectors.toList()).forEach(System.out::println);

        lists.stream().flatMap(Collection::stream)
                .collect(Collectors.toList()).forEach(System.out::println);


        Stream.of("ravi", "raj", "Mathew").map(String::length).collect(Collectors.toList())
                .forEach(e -> System.out.println(e.toString().concat(" ")));

        List lista = Arrays.asList("ravi, raj, Mathew");
        List listb = Arrays.asList("kahn, december, gabriella");
        Object result = Stream.of(lista,listb).flatMap(Collection::stream)
                        .collect(Collectors.toList());
        System.out.println(result);

        String s1 = "Jan,Feb,Mar";
        String s2 = "Apr,May,june";

        Stream.of(s1,s2).flatMap(e -> Stream.of(e.split(",")))
                .forEach(System.out::println);


    }
}
